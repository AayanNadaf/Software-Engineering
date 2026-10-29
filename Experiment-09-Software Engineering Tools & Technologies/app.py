import os

import mysql.connector
from dotenv import load_dotenv
from flask import Flask, jsonify, request, render_template
from werkzeug.security import check_password_hash, generate_password_hash

load_dotenv()
app = Flask(__name__)
@app.get("/")
def home():
    return render_template("index.html")

def get_db_connection():
    return mysql.connector.connect(
        host=os.getenv("DB_HOST", "127.0.0.1"),
        user=os.getenv("DB_USER"),
        password=os.getenv("DB_PASSWORD"),
        database=os.getenv("DB_NAME", "login_demo"),
    )


@app.get("/api/health")
def health():
    return jsonify({"status": "ok"})


@app.post("/api/register")
def register():
    data = request.get_json(silent=True) or {}
    username = data.get("username", "").strip()
    password = data.get("password", "")

    if len(username) < 3 or len(username) > 100:
        return jsonify({"error": "Username must be 3–100 characters."}), 400
    if len(password) < 8:
        return jsonify({"error": "Password must be at least 8 characters."}), 400

    password_hash = generate_password_hash(password)

    try:
        connection = get_db_connection()
        cursor = connection.cursor()
        cursor.execute(
            "INSERT INTO users (username, password_hash) VALUES (%s, %s)",
            (username, password_hash),
        )
        connection.commit()
        return jsonify({"message": "Account created."}), 201
    except mysql.connector.IntegrityError:
        return jsonify({"error": "That username is already registered."}), 409
    except mysql.connector.Error:
        app.logger.exception("Database error during registration")
        return jsonify({"error": "Could not create the account."}), 500
    finally:
        if "cursor" in locals():
            cursor.close()
        if "connection" in locals() and connection.is_connected():
            connection.close()


@app.post("/api/login")
def login():
    data = request.get_json(silent=True) or {}
    username = data.get("username", "").strip()
    password = data.get("password", "")

    connection = None
    cursor = None
    try:
        connection = get_db_connection()
        cursor = connection.cursor(dictionary=True)
        cursor.execute(
            "SELECT id, username, password_hash FROM users WHERE username = %s",
            (username,),
        )
        user = cursor.fetchone()

        if user and check_password_hash(user["password_hash"], password):
            return jsonify({
                "message": "Login successful.",
                "user": {"id": user["id"], "username": user["username"]},
            })

        return jsonify({"error": "Invalid username or password."}), 401
    except mysql.connector.Error:
        app.logger.exception("Database error during login")
        return jsonify({"error": "Could not complete login."}), 500
    finally:
        if cursor:
            cursor.close()
        if connection and connection.is_connected():
            connection.close()


if __name__ == "__main__":
    app.run(debug=True)