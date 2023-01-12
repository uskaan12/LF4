/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.teams.Array;

import java.util.Random;

/**
 *
 * @author Manfred Gerstgrasser
 */
public class Beispiel4 {

    /*
        Erstell ein Array mit 15 Feldern und fülle es mit Zufallszahlen 
        zwischen 1-100.
        Anschließend überprüfe ob das Array die Antwort auf die Frage nach
        dem Sinn des Lebens und allem Anderen (42) enthält. 
        Gib in der Konsole aus ob die 42 im Array drinnen ist und wenn ja
        an welcher Position.
     */
    public static void main(String[] args) {

        //Erstellen des Arrays
        int[] array = new int[15];

        //Füllen des Arrays
        Random zufall = new Random();
        for (int i = 0; i < array.length;i++){
            array[i] = zufall.nextInt(100)+1;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
         //Suche nach der Zahl 42
         boolean gefunden = false;
         for (int i = 0; i < array.length; i++) {
            if(array[i] == 42){
                System.out.println("42 wurde an Stelle " + i + " gefunden!");
                gefunden = true;
            }
        }
         
        if(!gefunden){
            System.out.println("42 wurde nicht gefunden!");
        }
         
        //Ausgabe der Antwort
        {
            
        }
    }
}
