/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.teams.Array;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Beispiel2 {
    
    /**
     * Erstelle ein Integer-Array mit der Länge 10 und fülle es mit
     * Zufallszahlen von 1-100. 
     * Anschließend zähle wie viele der Zahlen größer
     * als 50 sind und gib das Ergebnis in der Konsole aus
     */
    
    public static void main(String[] args) {
        
        //Erstellen des Arrays
        int[] array = new int[10];
        
        //Füllen des Arrays
        for(int i=0;i<array.length;i++){
            Random zufall = new Random();
            int zufallszahl = zufall.nextInt(100)+1;
            array[i] = zufallszahl;
            //array[i] = zufall.nextInt(100)+1;
            
            //Kontrollausgabe des Arrays
        System.out.print(array[i] + " ");
        }
        
        //Zähle alle Werte über 50 im Array
        int zaehler = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>50){
                zaehler++;
            }
        }
        System.out.println("");
        System.out.println("Im Array sind " + zaehler + " Zahl über 50");
    }
}
