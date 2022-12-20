/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.verzweigungen;

import javax.swing.JOptionPane;

/**
 *
 * @author INF2A_senoner_johann
 */
public class verterter_gehalt_2_8 {
    public static void main(String[] args) {
        int min_gehalt = 1000;
        double auto;
        double gehalt;
        
        String eingabe1 = JOptionPane.showInputDialog("Bitte geben sie die Anzahl der verkauften Autos ein.");
        auto = Double.parseDouble(eingabe1);
        
        if (auto >= 20) {
            gehalt = auto * 100 + min_gehalt + 500;
            System.out.println("Ihr Gehalt ist: " + gehalt + "€");
        }
        else {
            gehalt = auto * 100 + min_gehalt;
            System.out.println("Ihr Gehalt ist: " + gehalt + "€");
        }
    }
}
