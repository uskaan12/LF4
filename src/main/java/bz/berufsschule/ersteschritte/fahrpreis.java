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
public class fahrpreis {

    public static void main(String[] args) {
        double gesamtfahrkosten;
        double kosten_pro_km = 0.05;
        double kosten_pro_km_begleiter = 0.025;

        String eingabe1 = JOptionPane.showInputDialog("Gib die Anzahl der Schüler ein:");
        int schuler = Integer.parseInt(eingabe1);

        String eingabe2 = JOptionPane.showInputDialog("Gib die Anzahl der Schüler ein:");
        int begleitperson = Integer.parseInt(eingabe2);

    }
}
