/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.ersteschritte;

import javax.swing.JOptionPane;

/**
 *
 * @author INF2A_senoner_johann
 */
public class pythagoras {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        String ergebnis2 = JOptionPane.showInputDialog("Bitte gib das Wert von a an");
        String ergebnis3 = JOptionPane.showInputDialog("Bitte gib das Wert von b an");

        a = Double.parseDouble(ergebnis2);
        b = Double.parseDouble(ergebnis3);

        c = Math.sqrt(a * a + b * b);
        System.out.println("Die Hypotenuse c ergibt: " + c + " cm");
    }
}
