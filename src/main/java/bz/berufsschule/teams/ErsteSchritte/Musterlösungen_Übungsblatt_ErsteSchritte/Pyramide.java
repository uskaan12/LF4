/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritte_inf2a;

/**
 *
 * @author Administrator
 */
public class Pyramide {
    
    public static void main(String[] args) {
        
        int seitenLaengeA = 10;
        int hoehe = 8;
        
        double oberfläche= seitenLaengeA * seitenLaengeA + 2 * seitenLaengeA * hoehe;
        double volumen = 1.0/3.0 * seitenLaengeA * seitenLaengeA *hoehe;
        
        System.out.println("Die Oberfläche der rechteckigen Pyramide mit Seitenlänge" + seitenLaengeA + " beträgt "+ oberfläche +" cm²");
        System.out.println("Das Volumen der rechteckigen Pyramide mit Seienlänge " + seitenLaengeA + " beträgt " + volumen + " cm³");
    }
    
}
