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
public class eurtolire {

    public static void main(String[] args) {
        double lire;
        double lire_rounded;

        String eingabe = JOptionPane.showInputDialog("Gib die Euro ein:");
        double euro = Double.parseDouble(eingabe);

        lire = euro * 1936.27;
        lire_rounded = Math.round(lire * 100.0) / 100.0;

        System.out.println(euro + " Euro sind " + lire_rounded + " Lire");
    }

}
