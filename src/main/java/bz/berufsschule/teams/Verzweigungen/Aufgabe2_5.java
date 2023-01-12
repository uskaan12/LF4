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
public class Aufgabe2_5 {
    
    public static void main(String[] args) {
        
        String eingabe;
        int punkte;
        
        eingabe = JOptionPane.showInputDialog("Bitte geben Sie die erreichte Punktezahl ein!");
        punkte = Integer.parseInt(eingabe);
        
        if (punkte >= 1000){
            System.out.println("Gratulation! Sie erhalten eine Ehrenurkune.");
        }else if(punkte >= 800 && punkte <=999){
            System.out.println("Gratulation! Sie erhalten eine Siegerurkune.");
        }else{
            System.out.println("Schade! Sie haben die Minimalpunktzahl nicht erreicht.");
        }
    }
}
