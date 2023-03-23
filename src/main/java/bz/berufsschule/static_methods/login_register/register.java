package bz.berufsschule.static_methods.login_register;

import bz.berufsschule.utils.FileUtils;
import bz.berufsschule.utils.Kryptograph;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
        String file = "credentials.txt";
        FileUtils.CreateFile(file);
        String username = textField1.getText();
        String temp_password = passwordField1.getText();
        Random random = new Random();
        int zahl = random.nextInt(99) + 1;
        String password = Kryptograph.verschluesseln(temp_password, zahl);
        String merged = username + " " + password + " " + zahl;
        FileUtils.writeTextToFile(file, merged);
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
