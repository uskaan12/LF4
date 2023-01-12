/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

/**
 *
 * @author Administrator
 */
public class Aufgabe1_12 {
    
    public static void main(String[] args) {
        
        double nettoPreis = 130;
        
        double mwST = 130 * 0.2;
        
        double bruttoPreis = nettoPreis + mwST;
        
        System.out.println("Warenwert: \t" + nettoPreis + "€");
        System.out.println("Betrag MwST: \t" + mwST + "€");
        System.out.println("Gesamtwert: \t" + bruttoPreis + "€");
        
    }
    
}
