/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

/**
 *
 * @author Administrator
 */
public class Quadrat {
    
    public static void main(String[] args) {
        
        int seitenLänge = 5;
        
        int flaeche = seitenLänge * seitenLänge;
        int umfang = 4 * seitenLänge;
        
        /*
        In Java hat der + Operator zwei Funktion
            1. Addition
            2. Verkettung von Strings
        Der Compile entscheidet anhand der Datentypen, welche Funktion verwendet wird.
        Sind alle Operanden Zahl, wird die Addition verwendet
        Ist einer oder mehrere Opereanden ein String, wird die Verkettung benutzt.
        */
        
        System.out.println("Die Fläche beträgt" + flaeche + " cm.");
        System.out.println("Der Umfang beträgt" + umfang + " cm.");
        
    }
    
}
