/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

/**
 *
 * @author Administrator
 */
public class Zylinder {
    
    public static void main(String[] args) {
       
        double radius = 5;
        double hoehe = 10;
        double pi = 3.14;
        
        double oberflaeche = 2*pi *  radius * (radius + hoehe);
        System.out.println("Die Oberfläche des Zylinders beträgt " + oberflaeche + " cm²");
        
        double volumen = pi * radius * radius * hoehe;
        System.out.println("Das Volumen des Zylinders beträgt " + volumen + " cm³");
    }
    
}
