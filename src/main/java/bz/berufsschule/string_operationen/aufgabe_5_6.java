package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
Erstelle ein Programm welches die Vokale eines eingegebenen Textes zaehlt und amBildschirm ausgibt.
 */
public class aufgabe_5_6 {
    public static void main(String[] args) {
        String text_eingabe = JOptionPane.showInputDialog("Geben Sie eine Zeichenkette ein: ");
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int j = 0; j < text_eingabe.length(); j++) {
            if (text_eingabe.charAt(j) == 'a') {
                a++;
            }
            if (text_eingabe.charAt(j) == 'e') {
                e++;
            }
            if (text_eingabe.charAt(j) == 'i') {
                i++;
            }
            if (text_eingabe.charAt(j) == 'o') {
                o++;
            }
            if (text_eingabe.charAt(j) == 'u') {
                u++;
            }
        }
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}
