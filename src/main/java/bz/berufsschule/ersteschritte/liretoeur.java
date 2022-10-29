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
public class liretoeur {

    public static void main(String[] args) {
        double euro;
        double euro_rounded;

        String eingabe = JOptionPane.showInputDialog("Gib die Lire ein:");
        double lire = Integer.parseInt(eingabe);

        euro = lire / 1936.27;
        euro_rounded = Math.round(euro * 100.0) / 100.0;

        System.out.println(lire + " Lire sind " + euro_rounded + " Euro");
    }
}
