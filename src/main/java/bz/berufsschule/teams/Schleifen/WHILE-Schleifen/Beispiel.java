/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Beispiel {
    
      /*
        Erstelle ein Programm, das 6 Lottozahl zwischen 1 und 90 genriert. Achtung alle 6 Zahlen
        müssen einen anderen Wert haben.
    */
    
    public static void main(String[] args) {
        
        int lottozahl1 = 0;
        int lottozahl2 = 0;
        int lottozahl3 = 0;
        int lottozahl4 = 0;
        int lottozahl5 = 0;
        int lottozahl6 = 0;
        
        boolean wiederholen = true;
        Random zufall = new Random();
        
        while(wiederholen){
            
            lottozahl1 = zufall.nextInt(90)+1;
            lottozahl2 = zufall.nextInt(90)+1;
            lottozahl3 = zufall.nextInt(90)+1;
            lottozahl4 = zufall.nextInt(90)+1;
            lottozahl5 = zufall.nextInt(90)+1;
            lottozahl6 = zufall.nextInt(90)+1;
            
            if(lottozahl1 != lottozahl2 && lottozahl1 != lottozahl3 && lottozahl1 != lottozahl4 &&
               lottozahl1 != lottozahl5 && lottozahl1 != lottozahl6 && lottozahl2 != lottozahl3 &&
               lottozahl2 != lottozahl4 && lottozahl2 != lottozahl5 && lottozahl2 != lottozahl6 &&
               lottozahl3 != lottozahl4 && lottozahl3 != lottozahl5 && lottozahl3 != lottozahl6 &&
               lottozahl4 != lottozahl5 && lottozahl4 != lottozahl6 && lottozahl5 != lottozahl6)
            {
               wiederholen = false; //Damit wird die Schleife unterbrochen! 
            }
        }
        
        System.out.println("Die heutigen Lottozahl lauten : " + lottozahl1 + "-" + lottozahl2 + "-" + lottozahl3
        + "-" + lottozahl4 + "-" + lottozahl5 + "-" + lottozahl6);
    }
}
