/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

/**
 *
 * @author Administrator
 */
public class Beispiel1 {
    
    /*
        Man kann jede For-Schleife als While-Schleife programmieren 
        Schreibe die folgende For-Schleife als While-schleife:
            for(int i=0;i<10;i++){
                System.out.println("Der Wert von i ist " + i + "!");
            } 
        Diese Schleife wird 10 mal durchlaufen und gibt die Werte von 0 bis 9 aus
    */
    
    public static void main(String[] args) {
        
        int i = 0;
        while(i<10){
            System.out.println("Der Wert von i ist " + i + "!");
            i++;
        }
        
        System.out.println("Nach der Schleife hat i den Wert " + i);
    }
}
