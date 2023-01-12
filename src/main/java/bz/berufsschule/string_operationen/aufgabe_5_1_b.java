package bz.berufsschule.string_operationen;

import javax.swing.*;

/*
 * Created by IntelliJ IDEA.
 * Zwei Zeichenketten werden ̈uber die Tastatur eingelesen. Am Bildschirm soll ausgegeben werden, ob die beiden Zeichenketten gleich sind oder nicht, die Groß- und Kleinschreibung soll jedoch ignoriert werden.
 */
public class aufgabe_5_1_b {
    public static void main(String[] args) {
        String wort1 = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");
        String wort2 = JOptionPane.showInputDialog("Geben Sie ein Wort ein: ");
        if (wort1.equalsIgnoreCase(wort2)) {
            JOptionPane.showMessageDialog(null, "Die Wörter sind gleich.");
        } else {
            JOptionPane.showMessageDialog(null, "Die Wörter sind nicht gleich.");
        }
    }
}
