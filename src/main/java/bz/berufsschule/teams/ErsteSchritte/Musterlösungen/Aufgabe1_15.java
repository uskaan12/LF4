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
public class Aufgabe1_15 {
    
    public static void main(String[] args) {
        
        double wechselKurs = 1936.27;
        
        String eingabe = JOptionPane.showInputDialog("Geben Sie die Summe in Lire ein");
        double eingabeAlsZahl = Double.parseDouble(eingabe);
        
        double euro =  Math.round(eingabeAlsZahl / wechselKurs);
        
        System.out.println( eingabe +"Lire sind " + euro + " €");
    }
}
