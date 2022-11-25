package bz.berufsschule.while_schleife;

import javax.swing.*;

/*
Übung 1:
Erstelle ein Programm, das die Folge der Quadratzahlen bis zu einer vom Benutzer
eingegebenen obergrenze in der Konsole ausgibt. Die Zahlen sollen dabei durch einen
Beistrich und einem Leerzeichen getrennt werden. Nach der Letzten Zahl soll kein beistrich mehr
sein!
 */
public class uebung_quadreatzahlen {
    public static void main(String[] args) {
        int z = 1;
        String eingabe = JOptionPane.showInputDialog("Geben sie die Obergrenze ein");
        int grenze = Integer.parseInt(eingabe);
        boolean wiederholen = true;
        while (wiederholen) {
            if (grenze < z * z) {
                wiederholen = false;
            } else {
                if (z > 1) {
                    System.out.print(", " + z * z);
                } else {
                    System.out.print(z);
                }
                z++;
            }
        }
    }
}
