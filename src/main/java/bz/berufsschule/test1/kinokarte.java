/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.test1;

import javax.swing.JOptionPane;

/**
 * @author INF2A_senoner_johann
 */
public class kinokarte {
    public static void main(String[] args) {
        int alter;
        int reihe;
        double vollpreis = 10;
        double scontoalter = 0;
        double scontoreihe = 0;
        double zuschlagreihe = 0;
        double ergpreis;

        String eingabe1 = JOptionPane.showInputDialog("Bitte geben Sie ihren Alter ein:");
        alter = Integer.parseInt(eingabe1);

        String eingabe2 = JOptionPane.showInputDialog("Bitte geben ihre gewünschte Reihe an (1 bis 12):");
        reihe = Integer.parseInt(eingabe2);

        if (alter < 6) {
            scontoalter = vollpreis / 2;
        } else if (alter >= 6 && alter <= 12) {
            scontoalter = vollpreis * 0.25;
        } else if (alter >= 13 && alter <= 16) {
            scontoalter = vollpreis * 0.1;
        }

        if (reihe >= 1 && reihe <= 4) {
            scontoreihe = vollpreis * 0.3;
            zuschlagreihe = 0.0;
        } else if (reihe >= 9 && reihe <= 11) {
            scontoreihe = 0.0;
            zuschlagreihe = vollpreis * 0.3;
        } else if (reihe == 12) {
            scontoreihe = 0.0;
            zuschlagreihe = vollpreis * 0.5;
        }

        ergpreis = vollpreis - scontoalter - scontoreihe + zuschlagreihe;

        System.out.println("Der zu bezahlende Betrag Lautet: " + ergpreis + "€");
    }
}
