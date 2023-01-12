/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Beispiel2 {
    
    /*
        Schreibe ein Programm, das so lange würfelt bis die Gesamtsumme der 
        gewürfelten Augenzahlen 100 überschreitet
        Anschließend soll ausgegeben werden, wieviele Würfe das Programm benötigt hat.
    */
    
    public static void main(String[] args) {
        
        Random zufall = new Random();
        
        int summe = 0;
        int wuerfe = 0;
        
        while(summe < 100){
            
            int zufallszahl = zufall.nextInt(6)+1; //würfelt eine Zahl
            summe += zufallszahl;                  //zählt das Ergebnis zur Gesamtsumme dazu
            wuerfe++;                              //zählt die Würfe 
        }
        
        System.out.println("Sie haben " + wuerfe + " gebraucht um 100 zu erreichen!");
    }
}
