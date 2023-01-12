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
public class Beispiel3 {
    
    
    /**
     *  Lass dir seinen heuten SuperEna-Lotto Tipp generieren.
     *  Erstelle Array mit 7 Zufallszahlen zwischen 1-90 und gib 
     *  diese anschließend nach dem folgendem Beispiel aus:
     *  Ihr Tipp lautete: zahl1-zahl2-zahl3-zahl4-zahl5-zahl6 Superstar:zahl7
     */
    public static void main(String[] args) {
        
    
        //Erstellen des Arrays
        int[] lottotipp = new int[7];

        //Füllen des Arrays
        for(int i=0;i<lottotipp.length;i++){
            Random zufall = new Random();
            lottotipp[i] = zufall.nextInt(90)+1;
        }

        //Ausgabe des Arrays
        System.out.print("Ihr Tipp lautet: ");
        for (int i = 0; i < lottotipp.length; i++) {
            
            if(i==6){
                System.out.println(" Superstar: " + lottotipp[i]);
            }else if (i==5){
                System.out.print(lottotipp[i]);
            }else{
                System.out.print(lottotipp[i] + "-");
            }
        }
    }
}
