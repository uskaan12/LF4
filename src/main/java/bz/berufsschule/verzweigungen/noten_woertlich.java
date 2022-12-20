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
public class noten_woertlich {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Gib deine Note ein:");
        int note = Integer.parseInt(eingabe);
        
        if (note == 4) {
            System.out.println("Ungenügend!");
        } else if (note == 5) {
            System.out.println("Mangelhaft!");
        } else if (note == 6) {
            System.out.println("Ausreichend!");
        } else if (note == 7) {
            System.out.println("Befriedigend!");
        } else if (note == 8) {
            System.out.println("Gut!");
        } else if (note == 9) {
            System.out.println("Sehr Gut!");
        } else if (note == 10) {
            System.out.println("Exzellent!");
        }
        else{
            System.out.println("Der gegebene Wert ist ungültig!!!");
        }
    }
}
