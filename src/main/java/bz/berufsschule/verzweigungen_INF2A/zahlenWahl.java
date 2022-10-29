/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.verzweigungen_INF2A;

import javax.swing.JOptionPane;

/**
 *
 * @author INF2A_senoner_johann
 */
public class zahlenWahl {
    public static void main(String[] args) {
        String eingabe1 = JOptionPane.showInputDialog("Geben sie bitte die erste Zahl ein");
        int zahl1 = Integer.parseInt(eingabe1);
        
        String eingabe2 = JOptionPane.showInputDialog("Geben sie bitte die zweite Zahl ein");
        int zahl2 = Integer.parseInt(eingabe1);
        
        if (zahl1 > zahl2){
            System.out.println(zahl1);
        }
        
        else if(zahl1 < zahl2) {
            System.out.println(zahl2);
        }
        
        else {
            System.out.println(zahl1 + " " + zahl2);
        }
        
        
        
        
    }
}
