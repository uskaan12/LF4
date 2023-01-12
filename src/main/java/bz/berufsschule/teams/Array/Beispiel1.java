/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.teams.Array;

/**
 *
 * @author Administrator
 */
public class Beispiel1 {
    
    /**
     * Erstelle ein Integer-Array der Länge 5 und fülle es 
     * mit den Werten von 1-5
     */
    
    public static void main(String[] args) {
        
        // int[] array = {1,2,3,4,5};
        
        int array[] = new int[5]; //Integer-Array der Länge 5
        
        //Schleife zum Füllen des Arrays
        for(int i = 0;i<array.length;i++){
            array[i] = i+1;
        }
        
        //Ausgabe des Arrays
        //System.out.println(array); flasch, so wird nur die Speicheradresse ausgegeben
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
