/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritteinjava;

/**
 *
 * @author Administrator
 */
public class Pyramide {
 
    public static void main(String[] args) {
        
        
        int seitenLaengeA = 10;
        int hoehe = 20;
        
        double oberflaeche = seitenLaengeA * seitenLaengeA + 2 * seitenLaengeA * hoehe;
       System.out.println("Die Oberfläche des Zylinders beträgt " + oberflaeche + " cm²");
        
        double volumen = 1.0/3.0 * seitenLaengeA * seitenLaengeA * hoehe;
        System.out.println("Das Volumen des Zylinders beträgt " + volumen + " cm³");
    }
}
