/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forschleifen;

/**
 *
 * @author Administrator
 */
public class Beispiel2 {
    
    /*
        Erstelle ein Programm, das alle geraden Zahlen von 1 bis 100 
        in der Konsole ausgibt
    
        Anfangswert:    2
        Zielwert:       100
        Schrittweite:   2 
    
        i++  --> i = i +1
        i += 2 ---> i = i +2
        i -= 4 ---> i = i -4
        i *= 5 ---> i = i * 5
    */
    
    public static void main(String[] args) {
        
        for(int i=2;i<=100;i=i+2){
            System.out.println(i);
        }
    }
    
}
