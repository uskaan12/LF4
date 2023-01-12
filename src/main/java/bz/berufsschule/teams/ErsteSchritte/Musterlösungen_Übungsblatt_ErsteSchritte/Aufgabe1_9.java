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
public class Aufgabe1_9 {
    
    public static void main(String[] args) {
    
        String eingabe = JOptionPane.showInputDialog("Variable a");
        double a = Double.parseDouble(eingabe);
        String eingabe2 = JOptionPane.showInputDialog("Variable b");
        double b = Double.parseDouble(eingabe2);
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Die Hypothenuse erbibt " + c + "!");
 }
}
