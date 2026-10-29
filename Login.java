import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2, title;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Login() {
        setTitle("Login Page");
        setSize(400, 300);
        setLayout(null);

        // Violet Background
        getContentPane().setBackground(new Color(230, 220, 250));

        title = new JLabel("LOGIN PAGE");
        title.setBounds(115, 20, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(new Color(100, 30, 150));
        add(title);

        l1 = new JLabel("Username:");
        l1.setBounds(50, 80, 100, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 80, 180, 25);
        add(t1);

        l2 = new JLabel("Password:");
        l2.setBounds(50, 120, 100, 25);
        add(l2);

        t2 = new JPasswordField();
        t2.setBounds(150, 120, 180, 25);
        add(t2);

        b1 = new JButton("Login");
        b1.setBounds(80, 180, 100, 30);
        b1.setBackground(new Color(138, 43, 226));
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Clear");
        b2.setBounds(210, 180, 100, 30);
        b2.setBackground(new Color(100, 30, 150));
        b2.setForeground(Color.WHITE);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            String username = t1.getText().trim();
            String password = new String(t2.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this,
                        "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password!");
            }
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}