/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Übungsblatt_Schleifen_Aufgabe2 {
    
    public static void main(String[] args) {
        
        /*
            1. Kombination festlegen
            2. While-Schleife, die maximal 5 Mal ausgeführt wird bzw. 
               beendet wird wenn der Benutzer die Kombination richtig eingibt
            3. Beim 5. Versuch soll "Polizei angerufen" werden
        */
        
        int kombination = 666;
        boolean kombination_falsch = true;
        int z = 0;
        
        while(kombination_falsch && z<5){
        
            String eingabe = JOptionPane.showInputDialog("Geben Sie die Kombination ein");
            int eingabe_als_zahl = Integer.parseInt(eingabe);
            
            if(eingabe_als_zahl == kombination){
                System.out.println("Schloss geöffnet!");
                kombination_falsch = false;
            }else{
                System.out.println("Falsche Kombination");
                if(z==4){
                    System.out.println("Polizei wird verständigt!!!!!!");
                }
            }
            z++;
        }
        
    }
}
