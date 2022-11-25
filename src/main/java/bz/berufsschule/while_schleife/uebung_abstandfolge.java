package bz.berufsschule.while_schleife;

import javax.swing.*;

/*
Übung 2:
Abstandsfolge ---> Dabei wird der Abstand immer um 1 größer zb 1,2,4,7,11,16,22,29,37,...
 */
public class uebung_abstandfolge {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Geben sie die Obergrenze ein");
        int grenze = Integer.parseInt(eingabe);
        int summe = 1, z = 1;
        boolean wiederholen = true;
        while (wiederholen) {
            if (summe + z > grenze) {
                wiederholen = false;
            } else {
                summe = summe + z;
                if (z > 1) {
                    System.out.print(", " + summe);
                } else {
                    System.out.print(z + ", 2");
                }
                z++;
            }
        }
    }
}
