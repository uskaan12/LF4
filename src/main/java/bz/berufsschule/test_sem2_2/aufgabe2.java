package bz.berufsschule.test_sem2_2;


import bz.berufsschule.utils.euroUtils;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aufgabe2 extends JFrame implements ActionListener {
    private JTextArea textArea1;
    private JButton generateButton;
    private JPanel panel;

    public aufgabe2() {
        generateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] array1 = new int[6];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6) + 1;
        }
        int zahl1, zahl2, zahl3;
        zahl1 = array1[0];
        zahl2 = array1[1];
        zahl3 = array1[2];
        if (zahl1 == zahl2) {
            zahl2 = array1[3];
        } else if (zahl1 == zahl3) {
            zahl3 = array1[4];
        } else if (zahl2 == zahl3) {
            zahl3 = array1[5];
        } else {
            textArea1.setText(zahl1 + " " + zahl2 + " " + zahl3);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        aufgabe2 r = new aufgabe2();
        r.setContentPane(r.panel);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.pack();
        r.setVisible(true);
        r.setTitle("Aufgabe2");
    }
}
