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
public class Aufgabe2_4 {

    public static void main(String[] args) {

        int radius = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Radius ein!"));
        double pi = 3.14;

        if (radius > 0) {
            double flaeche = radius * radius * pi;
            double umfang = radius * 2 * pi;

            System.out.println("Die Fläche beträgt " + flaeche + " cm².");
            System.out.println("Der Umfang beträgt " + umfang + " cm.");
        }else{
            System.out.println("Der Radius muss eine positive Zahl sein.");
        }
    }

}
