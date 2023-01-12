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
public class Würfelspiel2 {
    
    public static void main(String[] args) {
        
        Random zufall = new Random();
        
        int pasch_1 = 0;
        int pasch_2 = 0;
        int pasch_3 = 0;
        int pasch_4 = 0;
        int pasch_5 = 0;
        int pasch_6 = 0;
        
        int most_pasch = 0;
        String name = "";
        
        
        for(int i=1;i<=500;i++){
        
            int zahl1 = zufall.nextInt(6)+1; //generiert Zahl von 1 - 6
            int zahl2 = zufall.nextInt(6)+1;
            
            if (zahl1 == 1 && zahl2 == 1){
                pasch_1++;
                if(pasch_1 > most_pasch){
                    most_pasch = pasch_1;
                    name = "1er Pasch";
                }
            }else if (zahl1 == 2 && zahl2 == 2){
                pasch_2++;
                if(pasch_2 > most_pasch){
                    most_pasch = pasch_2;
                    name = "2er Pasch";
                }
            }else if (zahl1 == 3 && zahl2 == 3){
                pasch_3++;
                if(pasch_3 > most_pasch){
                    most_pasch = pasch_3;
                    name = "3er Pasch";
                }
            }else if (zahl1 == 4 && zahl2 == 4){
                pasch_4++;
                if(pasch_4 > most_pasch){
                    most_pasch = pasch_4;
                    name = "4er Pasch";
                }
            }else if (zahl1 == 5 && zahl2 == 5){
                pasch_5++;
                if(pasch_5 > most_pasch){
                    most_pasch = pasch_5;
                    name = "5er Pasch";
                }
            }else if (zahl1 == 6 && zahl2 == 6){
                pasch_6++;
                if(pasch_6 > most_pasch){
                    most_pasch = pasch_6;
                    name = "6er Pasch";
                }
            }
        }
        
        int pasch_insgesamt = pasch_1+pasch_2+pasch_3+pasch_4+pasch_5+pasch_6;
        
        System.out.println("Es wurden " + pasch_insgesamt + " Pasch geworfen!");
        System.out.println("Am Öftesten wrude der " + name + " mit " + most_pasch + 
                " Mal gewürfelt");
                
    }
    
}
