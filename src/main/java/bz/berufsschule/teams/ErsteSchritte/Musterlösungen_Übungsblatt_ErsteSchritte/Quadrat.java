/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ersteschritte_inf2a;

/**
 *
 * @author Administrator
 */
public class Quadrat {
    
    
    //Um die Main-Methode schnell zu erstellen, schreibe main und drücke die Tabulator-Taste
    public static void main(String[] args) {
        
        int flaeche;
        int umfang;
        int seitenLaenge = 5;
        
        flaeche = seitenLaenge * seitenLaenge;
        umfang = 4*seitenLaenge;
        
        //Um System.out.println schnell einzufügen, schreibe sout und drücke die Tabulator-Taste
        System.out.println("Die Fläche des Quadrats beträgt " + flaeche + " cm.");
        System.out.println("Der Umfang des Quadrats beträgt " + umfang + " cm.");
        
    }
    
}
