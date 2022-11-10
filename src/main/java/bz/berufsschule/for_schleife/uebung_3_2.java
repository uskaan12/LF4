package bz.berufsschule.for_schleife;

import javax.swing.*;

public class uebung_3_2 {
    public static void main(String[] args) {
        String zielwertwert = JOptionPane.showInputDialog("Bitte geben sie die Sternanzahl an");
        int ziel = Integer.parseInt(zielwertwert);
        for (int i = 1; i <= ziel; i++) {
            System.out.print("*");
        }
    }
}
