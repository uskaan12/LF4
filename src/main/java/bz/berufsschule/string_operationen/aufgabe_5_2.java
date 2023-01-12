package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
    * Aufgabe 5.2
    * Erstelle ein Programm, welches zählt, wie oft ein eingegebener Buchstabe in einem
    * vorgegebenen Text vorkommt.
    * Beispiel:
    * Vorgegebener Text: "eine Uebung"
    * Eingegebener Buchstabe: "e"
    * Ausgabe am Bildschirm: Im Text "eine Uebung" kommt "e" 3 mal vor!
 */
public class aufgabe_5_2 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");
        String buchstabe_eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
        char buchstabe = buchstabe_eingabe.charAt(0);
        int anzahl = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == buchstabe) {
                anzahl++;
            }
        }
        System.out.println("Im Text \"" + text + "\" kommt \"" + buchstabe + "\" " + anzahl + " mal vor!");
    }
}
