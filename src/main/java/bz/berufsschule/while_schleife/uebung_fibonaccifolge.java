package bz.berufsschule.while_schleife;

import javax.swing.*;

/*
Übung 3
Fibonaccifolge --> 1,1,2,3,5,8,13,21,34,...
 */
public class uebung_fibonaccifolge {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Geben sie die Obergrenze ein");
        int grenze = Integer.parseInt(eingabe);
        int a = 1, b = 1, summe;
        boolean wiederholen = true;
        System.out.print("1, 1");
        while (wiederholen) {
            summe = a + b;
            a = b;
            b = summe;
            if (summe > grenze) {
                wiederholen = false;
            } else {
                System.out.print(", " + summe);
            }

        }
    }
}
