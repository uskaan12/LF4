package bz.berufsschule.arrays;

import javax.swing.*;

public class bsp7 {
    public static void main(String[] args) {
        //Benutzer gibt das Wort ein
        String wort = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");

        //die Methode toCharArray() wandelt ein String in ein char-Array um
        char[] wortArray = wort.toCharArray();

        for (int i = 0; i < wortArray.length; i++) {
            if (wortArray[i] == 'a' || wortArray[i] == 'e' || wortArray[i] == 'i' || wortArray[i] == 'o' || wortArray[i] == 'u') {

            }
        }

    }
}
