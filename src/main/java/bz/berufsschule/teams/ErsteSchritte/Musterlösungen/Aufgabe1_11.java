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
public class Aufgabe1_11 {
    
    public static void main(String[] args) {
        
        int gradCelcius;
        double gradFahrenheit;
        
        String eingabe = JOptionPane.showInputDialog("Geben die den Wert in Grad Celcius ein");
        gradCelcius = Integer.parseInt(eingabe);
        
        gradFahrenheit = 32 + gradCelcius * 9.0/5.0;
        
        System.out.println(gradCelcius + "°C sind " + gradFahrenheit +"°F");
    }
}
