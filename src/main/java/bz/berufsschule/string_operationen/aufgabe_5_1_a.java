package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
    * Created by IntelliJ IDEA.
    * Zwei Zeichenketten werden ̈uber die Tastatur eingelesen. Am Bildschirm soll ausgegeben werden, ob die beiden Zeichenketten gleich sind oder nicht.
 */
public class aufgabe_5_1_a {
    public static void main(String[] args) {
        String wort1 = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");
        String wort2 = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");
        if (wort1.equals(wort2)) {
            System.out.println("Die Zeichenketten sind gleich.");
        } else {
            System.out.println("Die Zeichenketten sind nicht gleich.");
        }
    }
}
