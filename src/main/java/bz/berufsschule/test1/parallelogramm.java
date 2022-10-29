/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.test1;

import javax.swing.JOptionPane;

/**
 * @author INF2A_senoner_johann
 */
public class parallelogramm {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double flaeche;
        double umfang;

        String eingabe1 = JOptionPane.showInputDialog("Bitte geben einen Wert für der Linie a in cm an:");
        a = Double.parseDouble(eingabe1);

        String eingabe2 = JOptionPane.showInputDialog("Bitte geben einen Wert für der Linie b in cm an:");
        b = Double.parseDouble(eingabe2);

        String eingabe3 = JOptionPane.showInputDialog("Bitte geben einen Wert für der Höhe in cm an:");
        h = Double.parseDouble(eingabe3);

        flaeche = a * h;
        umfang = a * 2 + b * 2;

        System.out.println("Die Fläche des Parallelograms beträgt " + flaeche + "cm² und der Umfang beträgt " + umfang + "cm.");
    }
}
