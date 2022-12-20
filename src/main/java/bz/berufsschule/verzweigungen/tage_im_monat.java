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
public class tage_im_monat {

    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Gib den Monat ein:");

        if (eingabe.equals("Januar")) {
            System.out.println("Dieser Monat hat 30 Tage!");
        } else if (eingabe.equals("Februar")) {
            System.out.println("Dieser Monat hat 28/29 Tage!");
        } else if (eingabe.equals("März")) {
            System.out.println("Dieser Monat hat 3 Tage!");
        } else if (eingabe.equals("April")) {
            System.out.println("Dieser Monat hat 30 Tage!");
        } else if (eingabe.equals("Mai")) {
            System.out.println("Dieser Monat hat 31 Tage!");
        } else if (eingabe.equals("Juni")) {
            System.out.println("Dieser Monat hat 30 Tage!");
        } else if (eingabe.equals("Juli")) {
            System.out.println("Dieser Monat hat 31 Tage!");
        } else if (eingabe.equals("August")) {
            System.out.println("Dieser Monat hat 31 Tage!");
        } else if (eingabe.equals("September")) {
            System.out.println("Dieser Monat hat 30 Tage!");
        } else if (eingabe.equals("Oktober")) {
            System.out.println("Dieser Monat hat 31 Tage!");
        } else if (eingabe.equals("November")) {
            System.out.println("Dieser Monat hat 30 Tage!");
        } else if (eingabe.equals("Dezember")) {
            System.out.println("Dieser Monat hat 31 Tage!");
        } else {
            System.out.println("Die Eingabe ist ungültig!");
        }
        
    }
}
