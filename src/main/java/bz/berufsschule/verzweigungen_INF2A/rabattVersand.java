package bz.berufsschule.verzweigungen_INF2A;
//TODO
// wenn preis < 100€  --> kein Rabatt..4,99€ versand
// wenn preis zwischen 100 und 600 -> 3,7% Rabatt ;4,99 versand
// wenn preis > 500 --> 5,5% Rabatt ; keine versandkosten
import javax.swing.*;

public class rabattVersand {
    public static void main(String[] args) {
        double gesamt, rabatt = 0, versand = 4.99, gesamt_rounded, rabatt_rounded;
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Preis an:");
        double preis = Double.parseDouble(eingabe);
        if (preis < 100) {
            gesamt = preis + versand;
            gesamt_rounded = Math.round(gesamt * 100.0) / 100.0;
            System.out.println("Preis: " + preis + "€");
            System.out.println("Rabatt: -" + rabatt + "€");
            System.out.println("Versand: " + versand + "€");
            System.out.println("---------------------");
            System.out.println("Gesamt: " + gesamt_rounded + "€");
        } else if (preis >= 100 && preis <= 500) {
            rabatt = preis * 0.037;
            gesamt = preis - rabatt + versand;
            rabatt_rounded = Math.round(rabatt * 100.0) / 100.0;
            gesamt_rounded = Math.round(gesamt * 100.0) / 100.0;
            System.out.println("Preis: " + preis + "€");
            System.out.println("Rabatt: -" + rabatt_rounded + "€");
            System.out.println("Versand: " + versand + "€");
            System.out.println("---------------------");
            System.out.println("Gesamt: " + gesamt_rounded + "€");
        } else {
            rabatt = preis * 0.055;
            versand = 0;
            gesamt = preis - rabatt;
            rabatt_rounded = Math.round(rabatt * 100.0) / 100.0;
            gesamt_rounded = Math.round(gesamt * 100.0) / 100.0;
            System.out.println("Preis: " + preis + "€");
            System.out.println("Rabatt: -" + rabatt_rounded + "€");
            System.out.println("Versand: " + versand + "€");
            System.out.println("---------------------");
            System.out.println("Gesamt: " + gesamt_rounded + "€");
        }
    }
}
