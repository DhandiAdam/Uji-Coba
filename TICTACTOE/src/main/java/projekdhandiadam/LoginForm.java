package projekdhandiadam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private static boolean isRegistered = false;
    private static String registeredEmail;
    private static String registeredPassword;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailText = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(20);

        JButton loginButton = new JButton("Login");

        panel.add(emailLabel);
        panel.add(emailText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isRegistered) {
                    String inputEmail = emailText.getText();
                    String inputPassword = new String(passwordText.getPassword());

                    if (inputEmail.equals(registeredEmail) && inputPassword.equals(registeredPassword)) {
                        JOptionPane.showMessageDialog(panel, "Login successful!");
                    } else {
                        JOptionPane.showMessageDialog(panel, "Invalid email or password. Please register first.");
                    }
                } else {
                    JOptionPane.showMessageDialog(panel, "Please register first.");
                }
            }
        });
    }
}
