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
public class Übungsblatt_Schleife_Aufgabe1 {
 
    public static void main(String[] args) {
        
          /*
            Erstelle ein Programm, das 20 Zufallszahlen zwischen 1 und 50 
            erzeugt und anschließend den 
            Durchschnitt dieser Zahlen berechnet und in der Konsole ausgibt
        
            1. Random Objekt erzeugen new Random()
            2. Ein Variable zum Speicher der Summe der zwanzig Zahlen
            3. Eine Schleife die 20 Zufallszahlen generiert und diese addiert
            4. Den Durchschnitt berechnen
            5. Ausgabe
        
            */      
               
          Random zufall = new Random();//1.
          int zahlen = 0;//2.
          for(int i=1;i<=20;i++){//3.
              int zufallszahl = zufall.nextInt(50)+1;
              zahlen = zahlen + zufallszahl;
          }
          
          double durchschnitt = zahlen/20.0;
          System.out.println("Der Durchschnitt der 20 Zahlen lautet: " 
                  + durchschnitt);
          
    }
}
