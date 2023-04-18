package bz.berufsschule.static_methods.currency;

import bz.berufsschule.utils.FileUtils;
import bz.berufsschule.utils.Kryptograph;
import bz.berufsschule.utils.euroUtils;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class pruefziffer extends JFrame implements ActionListener{
    private JTextField Seriennummer;
    private JButton berechneButton;
    private JLabel Resultat;
    private JPanel panel;

    public pruefziffer(){
        berechneButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String strSeriennummer = Seriennummer.getText();
        int erg = euroUtils.pruefziffer(strSeriennummer);
        String strErg = Integer.toString(erg);
        Resultat.setText(strErg);
        System.out.println(erg);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        pruefziffer r = new pruefziffer();
        r.setContentPane(r.panel);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Prüfziffer");
    }
}


