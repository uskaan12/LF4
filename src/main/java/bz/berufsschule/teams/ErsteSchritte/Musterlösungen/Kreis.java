/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

/**
 *
 * @author Administrator
 */
public class Kreis {
    
    public static void main(String[] args) {
        
        int radius = 10;
        double pi = 3.14;
        
        double flaeche = radius * radius * pi;
        double umfang = radius * 2 * pi;
        
        /*
            Achtung: Wenn bei einer Rechnung verschiedene Datentypen verwendet werden , muss
                     das Ergebnis in eine Variable des größeren Datentype gespeichert
                     werden!
                     double = int + double
                     int = short + int
                     long = int + long
        */
        
        System.out.println("Die Fläche beträgt " + flaeche + " cm².");
        System.out.println("Der Umfang beträgt " + umfang + " cm.");
        
        /* In Java hat der + Operator zwei Funktionen
            1. Addition
            2. Verkettung
           Der Compiler entscheidet anhand der Datentypen der Operanden welche
           Funktion verwendet wird. Sind alle Operanden Zahlen wird die Addition
           verwendet. Ist ein Operand oder mehrere Operanden
           ein String wird die Verkettung verwendet.
        */
    }
}
