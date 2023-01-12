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
public class Aufgabe1_9 {
    
    public static void main(String[] args) {
        
        int seiteA;
        int seiteB;
        double seiteC;
        
        String eingabeA = JOptionPane.showInputDialog("Bitte geben Sie A ein");
        seiteA = Integer.parseInt(eingabeA);
        
        String eingabeB = JOptionPane.showInputDialog("Bitte geben Sie B ein");
        seiteB = Integer.parseInt(eingabeB);
        
        seiteC = Math.sqrt(seiteA*seiteA + seiteB*seiteB);
        
        System.out.println("Die Länge der Hypothenuse beträgt: " + seiteC + " cm");
    }
    
}
