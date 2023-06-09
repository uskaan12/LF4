package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
Aus einem eingelesenen String werden die Buchstaben 3-6 ausgeschnitten und am
Bildschirm ausgegeben. Wenn die Zeichenkette weniger als 6 Buchstaben hat, soll
eine Fehlermeldung erscheinen.
 */
public class aufgabe_5_4 {
    public static void main(String[] args) {
        String text_eingabe = JOptionPane.showInputDialog("Geben Sie eine Zeichenkette ein: ");
        if (text_eingabe.length() < 6) {
            System.out.println("Fehler: Zeichenkette zu kurz");
        } else {
            String textKlein = text_eingabe.substring(2, 6);
            System.out.println("Ausgeschnittener Text: " + textKlein);
        }
    }
}
