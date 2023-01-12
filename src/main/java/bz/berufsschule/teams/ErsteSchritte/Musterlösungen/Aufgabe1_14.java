/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe1_14 {
    
    //Euro in Lire
    
    public static void main(String[] args) {
        
        double wechselKurs = 1936.27;
        
        String eingabe = JOptionPane.showInputDialog("Geben Sie den Wert in Euro ein.");
        int eingabeAlsZahl = Integer.parseInt(eingabe);
        
        double lire = eingabeAlsZahl * wechselKurs;
        
        System.out.println( eingabe +"€ sind " + lire + " Lire");
    }
}
