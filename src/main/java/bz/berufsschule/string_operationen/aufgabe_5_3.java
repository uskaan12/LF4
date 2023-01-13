package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
Eine Zeichenkette wird eingelesen. Aus dieser Zeichenkette sollen zwei neue Variablen gebildet werden,
welche den eingegebenen Text jeweils in Klein- und Großbuchstaben beinhalten.
Diese Variablen sollen am Bildschirm ausgegeben werden.
 */
public class aufgabe_5_3 {
    public static void main(String[] args) {
        // Variablen
        String text = JOptionPane.showInputDialog("Geben Sie eine Zeichenkette ein: ");
        String textKlein = text.toLowerCase();
        String textGross = text.toUpperCase();
        System.out.println("Kleinbuchstaben: " + textKlein);
        System.out.println("Großbuchstaben: " + textGross);
    }
}
