package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
Die Buchstaben einer eingegebenen Zeichenkette sollen untereinander am Bild-schirm ausgegeben werden.
 */
public class aufagbe_5_5 {
    public static void main(String[] args) {
        // Eingabe
        String text = JOptionPane.showInputDialog("Geben Sie eine Zeichenkette ein: ");
        // Verarbeitung
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
