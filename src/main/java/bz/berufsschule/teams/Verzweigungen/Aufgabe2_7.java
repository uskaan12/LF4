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
public class Aufgabe2_7 {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int rest;
        
        String eingabeA = JOptionPane.showInputDialog("Bitte geben Sie Zahl A ein");
        String eingabeB = JOptionPane.showInputDialog("Bitte geben Sie Zahl B ein");
        
        a = Integer.parseInt(eingabeA);
        b = Integer.parseInt(eingabeB);
        
        rest = a%b;
        
        if (rest == 0){
            System.out.println( b + " ist ein Teiler von " + a);
            
        }else{
            System.out.println(b + " ist kein Teiler von " + a);
        }
    }
}
