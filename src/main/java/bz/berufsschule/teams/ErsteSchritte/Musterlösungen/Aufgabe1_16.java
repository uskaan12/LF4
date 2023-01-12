/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe1_16 {
 
    public static void main(String[] args) {
        
        int stunden;
        int minuten;
        int sekunden;
        
        String eingabe = JOptionPane.showInputDialog("Geben Sie die Sekunden ein");
        int eingabeAlsZahl = Integer.parseInt(eingabe);
        
        stunden = eingabeAlsZahl / 3600;
        int rest = eingabeAlsZahl%3600;
        minuten = rest/60;
        sekunden = rest%60;
        
        System.out.println(eingabe + " Sekunden sind " + stunden +"h " + minuten+ "m "+ sekunden + "s");
        
    }
    
}
