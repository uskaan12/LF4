/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package bz.berufsschule.ersteschritte;

/**
 *
 * @author INF2A_senoner_johann
 */
public class zylinder_rechnung {

    public static void main(String[] args) {
        double oberfleache;
        double grundflaeche;
        double mantelflaeche;
        double radius;
        double hoehe;
        int potenz = 2;
        double umfang;
        double volumen;
        double pi = 3.14;

        radius = 5;
        hoehe = 3;

        grundflaeche = pi * Math.pow(radius, potenz);
        volumen = grundflaeche * hoehe;
        System.out.println("Das Volumen ist: " + volumen);

        umfang = (2 * radius * pi);
        mantelflaeche = umfang * hoehe;
        oberfleache = (2 * grundflaeche + mantelflaeche);
        System.out.println("Die Oberflaeche ist: " + oberfleache);
    }
}
