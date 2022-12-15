package bz.berufsschule.test2;

import javax.swing.*;

public class aufgabe2 {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Bitte geben sie die Obergrenze an:");
        int obergrenze = Integer.parseInt(eingabe);
        for (int i = 1; i <= obergrenze; i++) {
            if (i % 5 != 0 && i % 6 != 0) {
                System.out.println(i);
            }
        }
    }
}
