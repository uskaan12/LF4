package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;
import java.util.Scanner;

public class beispiel8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie ein wie viele Pizzas geliefert werden sollen: ");
        String eingabe = scanner.nextLine();
        int anzahl = parseNumber(eingabe);
        System.out.println("Sie haben " + anzahl + " Pizzas bestellt.");

        scanner.close();

        //wähle belag
        String[] belag = {"Klassisch: Tomatensauce, Mozzarella-Käse, Salami", "Margherita: Tomatensauce, Mozzarella-Käse, frisches Basilikum", "Vier Käse: Mozzarella, Parmesan, Gorgonzola und Ricotta", "Speck: Tomatensauce, Mozzarella, Speck, Zwiebeln", "Prosciutto: Tomatensauce, Mozzarella, Prosciutto, Rucola"};
        String[] groesse = {"klein", "mittel", "groß"};
        String[][] pizza = new String[anzahl][2];

        //wähle belag
        for (int i = 0; i < anzahl; i++) {
            int belagIndex = (int) (Math.random() * belag.length);
            pizza[i][0] = belag[belagIndex];
        }

        //wähle größe
        for (int i = 0; i < anzahl; i++) {
            int groesseIndex = (int) (Math.random() * groesse.length);
            pizza[i][1] = groesse[groesseIndex];
        }
        //ausgabe
        for (int i = 0; i < anzahl; i++) {
            System.out.println("Pizza " + (i + 1) + ": " + pizza[i][0] + " " + pizza[i][1]);
        }

    }

    private static int parseNumber(String input) {
        // Entferne alle Leerzeichen aus der Eingabe
        input = input.replaceAll("\\s", "");

        // Wenn die Eingabe bereits eine Zahl ist, gib sie zurück
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
        }

        // Wenn die Eingabe ausgeschriebene Zahlen enthält, konvertiere sie in eine Zahl
        switch (input.toLowerCase()) {
            case "eins":
                return 1;
            case "zwei":
                return 2;
            case "drei":
                return 3;
            case "vier":
                return 4;
            case "fünf":
                return 5;
            case "sechs":
                return 6;
            case "sieben":
                return 7;
            case "acht":
                return 8;
            case "neun":
                return 9;
            case "zehn":
                return 10;
            default:
                throw new IllegalArgumentException("Ungültige Eingabe: " + input);
        }
    }
}

