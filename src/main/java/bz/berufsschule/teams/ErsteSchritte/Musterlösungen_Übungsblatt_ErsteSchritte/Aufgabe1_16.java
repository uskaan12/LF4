/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritte_inf2a;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe1_16 {
 
    public static void main(String[] args) {
        
        
        String eingabe;
        int stunden;
        int minuten;
        int sekunden;
        
        eingabe = JOptionPane.showInputDialog("Gib die Anzahl der Sekunden ein");
        sekunden = Integer.parseInt(eingabe);
        
        stunden = sekunden /3600;
        int rest = sekunden % 3600;
        minuten = rest / 60;
        sekunden = rest % 60;
        
        
        System.out.println("Das Ergebnis lautet: " + stunden + ":" + minuten + ":" +sekunden);
    }
}
