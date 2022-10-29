/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.verzweigungen_INF2A;

import javax.swing.JOptionPane;

/**
 * @author INF2A_senoner_johann
 */
public class altersuebrpruefung {

    public static void main(String[] args) {
        /*
        Schreibe eine Java Anwendung die Überprüft ob der Benutzer volljährig ist
         */
        String eingabe = JOptionPane.showInputDialog("Bitte geben sie ihr Alter ein:");
        int alter = Integer.parseInt(eingabe);

        if (alter >= 18) {
            System.out.print("Sie sind volljährig!");
        } else {
            System.out.println("Sie sind nicht voljährig!");
        }
    }
}
