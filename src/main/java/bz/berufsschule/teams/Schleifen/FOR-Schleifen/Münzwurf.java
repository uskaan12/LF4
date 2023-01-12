/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forschleifen;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Münzwurf {

    // Erstelle ein Programm, das einen Münzwurf simuliert
    // 0 --> Kopf, 1 --> Zahl
    public static void main(String[] args) {

        Random zufall = new Random();
        
        int kopf = 0;
        int zahl = 0;
        
        for (int i = 1; i <= 100; i++) { //i++ ---> i=i+1 --> i += 1
            int wurfergebnis = zufall.nextInt(2);

            if (wurfergebnis == 0) {
                kopf++;
            } else {
                zahl++;
            }
        }
        
        System.out.println("Kopf: " + kopf);
        System.out.println("Zahl: " + zahl);
    }

}
