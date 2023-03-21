package bz.berufsschule.static_methods.login_register;

import bz.berufsschule.utils.FileUtils;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField textField1;
    private JButton registerButton;
    private JPasswordField passwordField1;

    public register() {
        registerButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String file = "login.txt";
        FileUtils.CreateFile(file);
        String username = textField1.getText();
        String password = passwordField1.getText();
        String merged = username + " " + password;
        FileUtils.writeTextToFile("login.txt", merged);
        System.exit(0);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        register r = new register();
        r.setContentPane(r.panel1);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Register");
    }
}
