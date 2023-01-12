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
public class Würfelspiel1 {

    public static void main(String[] args) {

        Random zufall = new Random();

        int seite_1 = 0;
        int seite_2 = 0;
        int seite_3 = 0;
        int seite_4 = 0;
        int seite_5 = 0;
        int seite_6 = 0;
        int summe = 0;

        for (int i = 1; i <= 100; i++) { //i++ ---> i=i+1 --> i += 1
            int wurfergebnis = zufall.nextInt(6) + 1;
            
            if(wurfergebnis == 1){
                seite_1++;
            }else if(wurfergebnis == 2){
                seite_2++;
            }else if(wurfergebnis == 3){
                seite_3++;
            }else if(wurfergebnis == 4){
                seite_4++;
            }else if(wurfergebnis == 5){
                seite_5++;
            }else if(wurfergebnis == 6){
                seite_6++;
            }

            summe = summe + wurfergebnis;
        }

        System.out.println("1: " + seite_1);
        System.out.println("2: " + seite_2);
        System.out.println("3: " + seite_3);
        System.out.println("4: " + seite_4);
        System.out.println("5: " + seite_5);
        System.out.println("6: " + seite_6);
        
        
        System.out.println("Insgsamte wurden " + summe + " Augen geworfen");
    }

}
