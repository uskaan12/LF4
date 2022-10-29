/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.test1;

import javax.swing.JOptionPane;

/**
 * @author INF2A_senoner_johann
 */
public class differenz {
    public static void main(String[] args) {
        int zahl1;
        int zahl2;
        int erg;

        String eingabe1 = JOptionPane.showInputDialog("Bitte geben Sie ein Wert für Zahl1 ein:");
        zahl1 = Integer.parseInt(eingabe1);

        String eingabe2 = JOptionPane.showInputDialog("Bitte geben Sie ein Wert für Zahl2 ein:");
        zahl2 = Integer.parseInt(eingabe2);

        if (zahl1 != zahl2) {
            if (zahl1 > zahl2) {
                erg = zahl1 - zahl2;
                System.out.println("Zahl1 ist um " + erg + " größer als Zahl2");
            } else {
                erg = zahl2 - zahl1;
                System.out.println("Zahl2 ist um " + erg + " größer als Zahl1");
            }
        } else {
            System.out.println("FEHLER - Die Zahlen müssen unterschiedlich groß sein!");
        }
    }
}
