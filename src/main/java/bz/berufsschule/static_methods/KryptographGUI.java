package bz.berufsschule.static_methods;

import bz.berufsschule.utils.Kryptograph;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KryptographGUI extends JFrame implements ActionListener{
    private JTextArea textArea1;
    private JTextField textField1;
    private JTextArea textArea2;
    private JButton enter;
    private JPanel panel1;
    private JLabel status;

    public KryptographGUI() {
        enter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String checktxt1=textArea1.getText().trim();
        String checktxt2=textArea2.getText().trim();
        String schluessel=textField1.getText();
        if (schluessel.equals("")){
            status.setText("Status: Kein Schlüssel");
        } else if (checktxt1.equals("") && !checktxt2.equals("")) {
            String text = textArea2.getText();
            int zahl = Integer.parseInt(schluessel);
            String text2 = Kryptograph.entschluesseln(text,zahl);
            textArea1.setText(text2);
        } else if (checktxt2.equals("") && !checktxt1.equals("")) {
            String text = textArea1.getText();
            int zahl = Integer.parseInt(schluessel);
            String text2 = Kryptograph.verschluesseln(text,zahl);
            textArea2.setText(text2);
        } else if (!checktxt1.equals("") && !checktxt2.equals("")) {
            status.setText("Status:  Too much Text");
        } else {
            status.setText("Status: Kein Text");
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        KryptographGUI r = new KryptographGUI();
        r.setContentPane(r.panel1);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Kryptograph");
    }
}
