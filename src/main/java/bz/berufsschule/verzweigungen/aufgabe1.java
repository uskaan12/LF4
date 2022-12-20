package bz.berufsschule.verzweigungen;

import java.util.Random;

public class aufgabe1 {
    public static void main(String[] args) {
        Random zufallsgenerator = new Random();
        int zufallszahl = zufallsgenerator.nextInt(101);
        if(zufallszahl <= 42){
            System.out.println("Deine Zahl ist " + zufallszahl + " Du hast gewonnen!!!");
        }
        else {
            System.out.println("Deine Zahl ist " + zufallszahl + " Du hast verloren :(");
        }
    }
}
