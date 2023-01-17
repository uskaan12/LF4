package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
Die Buchstaben einer eingegebenen Zeichenkette sollen untereinander am Bild-schirm ausgegeben werden.
 */
public class aufagbe_5_5 {
    public static void main(String[] args) {
        String text_eingabe = JOptionPane.showInputDialog("Geben Sie eine Zeichenkette ein: ");
        for (int i = 0; i < text_eingabe.length(); i++) {
            System.out.println(text_eingabe.charAt(i));
        }
    }
}
