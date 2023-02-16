package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;

public class beispiel8 {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie ein vie viele Pizzas geliefert werden sollen");
        int anzahl = Integer.parseInt(eingabe);

        System.out.println("Anzahl der Pizzas: " + anzahl);

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
}
