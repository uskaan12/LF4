/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verzweigungen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe2_2 {
    
    public static void main(String[] args) {
        
        int monat;
        
        String eingabe = JOptionPane.
                showInputDialog("Geben Sie den Monat ein");
        monat = Integer.parseInt(eingabe);
        
        if(monat == 1 || monat == 3 || monat == 5 || monat == 7
           || monat == 8 || monat == 10 || monat == 12     ){
            
            System.out.println("31 Tage");
        }else if(monat == 2){
            System.out.println("28 Tage");
        }else{
            System.out.println("30 Tage");
        }
    }
    
}
