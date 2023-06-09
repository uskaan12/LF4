package bz.berufsschule.static_methods.login_register;

import bz.berufsschule.utils.FileUtils;
import bz.berufsschule.utils.Kryptograph;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class login extends JFrame implements ActionListener{
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel status;
    public login(){
        loginButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String file = "credentials.txt";
        String ausgabe = FileUtils.textFromFile(file);
        String username = textField1.getText();
        String temp_password = passwordField1.getText();
        int zahl = Integer.parseInt(ausgabe.split(" ")[2]);
        String password = Kryptograph.verschluesseln(temp_password, zahl);
        if (Objects.equals(username, ausgabe.split(" ")[0]) && Objects.equals(password, ausgabe.split(" ")[1])){
            status.setText("Success");
            System.out.println("Success");
            System.exit(0);
        } else {
            status.setText("Failed");
            System.out.println("Failed");
        }


    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        login r = new login();
        r.setContentPane(r.panel1);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Login");
    }
}
