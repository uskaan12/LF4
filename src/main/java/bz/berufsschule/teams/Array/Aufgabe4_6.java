/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Random;

/**
 *
 * @author Manfred Gerstgrasser
 */
public class Aufgabe4_6 {
    
    public static void main(String[] args) {
        
        //Erstellen eines Arrays vom Type double mit 100 Feldern
        double[] array = new double[100];
        
        //Füllen des Arrays mit double Zahlen zwischen 0 und 1
        Random zufall = new Random();
        for(int i=0;i<array.length;i++){
            array[i] = zufall.nextDouble();//nextDouble() erzeugt Zufallszahle zwischen 0 und 1
        }
        
        //Suche nach der kleinsten Zahl
        double kleinste_zahl = 2;
        for (int i = 0; i < array.length; i++) {
            
            if(array[i]<kleinste_zahl){
                kleinste_zahl = array[i];
            }
        }
        System.out.println("Die kleinste Zahl im Array lautet: "+kleinste_zahl);
    }
}
