import tkinter as tk
from tkinter import messagebox

def login():
    username = entry1.get().strip()
    password = entry2.get()

    if username == "admin" and password == "1234":
        messagebox.showinfo("Success", "Login Successful!")
    else:
        messagebox.showerror(
            "Error", "Invalid Username or Password!"
        )

def clear():
    entry1.delete(0, tk.END)
    entry2.delete(0, tk.END)

root = tk.Tk()
root.title("Login Page")
root.geometry("400x320")
root.configure(bg="#E6E6FA")
root.resizable(False, False)

title = tk.Label(
    root,
    text="LOGIN PAGE",
    font=("Arial", 22, "bold"),
    bg="#E6E6FA",
    fg="#6A0DAD"
)
title.pack(pady=20)

tk.Label(
    root,
    text="Username:",
    font=("Arial", 12),
    bg="#E6E6FA",
    fg="#4B0082"
).pack()

entry1 = tk.Entry(root, font=("Arial", 12))
entry1.pack(pady=5)

tk.Label(
    root,
    text="Password:",
    font=("Arial", 12),
    bg="#E6E6FA",
    fg="#4B0082"
).pack()

entry2 = tk.Entry(root, show="*", font=("Arial", 12))
entry2.pack(pady=5)

tk.Button(
    root,
    text="Login",
    command=login,
    bg="#8A2BE2",
    fg="white",
    width=12
).pack(pady=8)

tk.Button(
    root,
    text="Clear",
    command=clear,
    bg="#6A0DAD",
    fg="white",
    width=12
).pack()

root.mainloop()