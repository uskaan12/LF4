/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

/**
 *
 * @author Administrator
 */
public class Aufgabe1 {
    
    
    /*
        Schreibe ein Programm, das mittels einer Schleife die Summe der 
	   Zahlen von 1 bis 100 ermittelt; 
    */
    
    
    public static void main(String[] args) {
        
        int summe = 0; //In dieser wird die Summe zwischengespeichert
        
        for (int i = 1; i <= 100; i++) {
            summe = summe + i; // Addiert die aktuell Zahl i zur Summe dazu und speichert 
                               //das ergebnis wieder in der Variable Summe ag
        }
    }
}
