/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Übung_Folge_Abstandsfolge {
    
    
    /*
        Übung 2
        Abstandsfolge ---> Dabei wird der Abstand immer um 1 größer zb 1,2,4,7,11,16,22,29,37,....
    */
    
    public static void main(String[] args) {
        
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie die Obergrenze ein!");
        int grenze = Integer.parseInt(eingabe);
        
        int summe = 1;
        int z=0;
        boolean wiederholen = true;
        
        while(wiederholen){
        
            if(summe + z > grenze){
                wiederholen = false;
            }else{
                
                summe = summe + z;
            
                if(z==0){
                    System.out.print(summe);
                }else{
                    System.out.print(", "+ summe);
                }
            }
            z++;
        }
    }
}
