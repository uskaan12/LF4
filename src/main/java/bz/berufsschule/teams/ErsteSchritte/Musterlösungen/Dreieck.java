/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

/**
 *
 * @author Administrator
 */
public class Dreieck {
    
    public static void main(String[] args) {
        
        
        //Diese Variable sind die Seite a, b und c eines Dreiecks
        int seiteA = 6;
        int seiteB = 9;
        int seiteC = 12;
        
        //U = a+b+c
        int umfang = seiteA+seiteB+seiteC;
        System.out.println("Der Umfang des Dreiecks beträgt "+ umfang + " cm");
        
        //F = a*b/2
        double flaeche = seiteA *seiteB /2;
        System.out.println("Die Fläche des Dreiecks beträgt "+ flaeche + " cm²");
               
                
    }
    
    
}
