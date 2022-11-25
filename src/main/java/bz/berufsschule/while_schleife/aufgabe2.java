package bz.berufsschule.while_schleife;

import javax.swing.*;

public class aufgabe2 {
    public static void main(String[] args) {
        int kombination = 666;
        boolean kombination_falsch = true;
        int z = 0;
        while (kombination_falsch = true && z < 5) {
            String eingabe = JOptionPane.showInputDialog("Geben sie die Kombination ein");
            int eingabe_als_zahl = Integer.parseInt(eingabe);

            if (eingabe_als_zahl == kombination) {
                kombination_falsch = false;
            } else {
                System.out.println("");
            }
        }
    }
}
