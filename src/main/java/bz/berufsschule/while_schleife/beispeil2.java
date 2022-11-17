package bz.berufsschule.while_schleife;

import java.util.Random;

/*
Schreibe ein Programm, das so lange würfelt bis die Gesamte der
gewürfelten Augenzahlen 100 überschreitet.
Anschließend soll ausgegeben werden, wie viele Würfe das Programm benötigt hat.
*/
public class beispeil2 {
    public static void main(String[] args) {
        Random zufall = new Random();
        int summe = 0, wuerfe = 0;

        while (summe < 100) {
            int zufallszahl = zufall.nextInt(6) + 1;
            summe += zufallszahl;
            wuerfe++;
        }
        System.out.println("Sie haben " + wuerfe + " Würfe gebraucht um 100 zu überschreiten.");
    }
}
