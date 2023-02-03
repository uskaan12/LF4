package bz.berufsschule.arrays.eindimensionale_arrrays;

import javax.swing.*;

public class bsp7 {
    public static void main(String[] args) {
        int zaehler_vokale = 0, zaehler_konsonanten = 0;
        //Benutzer gibt das Wort ein
        String wort = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");

        //die Methode toCharArray() wandelt ein String in ein char-Array um
        char[] wortArray = wort.toCharArray();

        for (int i = 0; i < wortArray.length; i++) {
            if (wortArray[i] == 'a' || wortArray[i] == 'e' || wortArray[i] == 'i' || wortArray[i] == 'o' || wortArray[i] == 'u') {
                zaehler_vokale++;
            } else {
                zaehler_konsonanten++;
            }
        }
        //Ausgabe
        JOptionPane.showMessageDialog(null, "Das Wort " + wort + " enthält " + zaehler_vokale + " Vokale und " + zaehler_konsonanten + " Konsonanten.");
    }
}
