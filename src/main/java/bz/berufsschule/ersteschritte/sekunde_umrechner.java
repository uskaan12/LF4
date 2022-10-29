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
public class sekunde_umrechner {

    public static void main(String[] args) {
        int sekunden;
        int minuten;
        int stunden;
        int zahl2;

        String eingabe = JOptionPane.showInputDialog("Gib die Sekunden ein:");
        int zahl = Integer.parseInt(eingabe);

        stunden = zahl / 3600;
        zahl2 = zahl % 3600;
        minuten = zahl2 / 60;
        sekunden = zahl2 % 60;

        System.out.println(zahl + "Sekunden sind: " + stunden + "h " + minuten + "m " + sekunden + "s");
    }
}
