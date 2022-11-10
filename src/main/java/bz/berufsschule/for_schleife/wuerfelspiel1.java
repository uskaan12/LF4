package bz.berufsschule.for_schleife;

import java.util.Random;

/*
    Erstelle ein Programm, das einen Würfel (1-6) simuliert.
    Der Würfel soll 100 Mal geworfen werden und am Ende soll
    eine Statistik darüber ausgegeben werden, dh. wie oft wurde
    1 gewürfelt, wie oft oft wurde 2 gewürfelt usw...
    Zusätzlich soll noch die Summe aller Würde ausgegeben werden.
     */
public class wuerfelspiel1 {
    public static void main(String[] args) {
        Random zufall = new Random();
        int eins = 0, zwei = 0, drei = 0, vier = 0, fuenf = 0, sechs = 0, summe;
        for (int i = 1; i <= 100; i++) {
            int wurfergebnis = zufall.nextInt(6) + 1;
            switch (wurfergebnis) {
                case 1:
                    eins++;
                    break;
                case 2:
                    zwei++;
                    break;
                case 3:
                    drei++;
                    break;
                case 4:
                    vier++;
                    break;
                case 5:
                    fuenf++;
                    break;
                case 6:
                    sechs++;
                    break;
                default:
                    break;
            }
        }
        summe = eins + zwei * 2 + drei * 3 + vier * 4 + fuenf * 5 + sechs * 6;
        System.out.println("Eins: " + eins);
        System.out.println("Zwei: " + zwei);
        System.out.println("Drei: " + drei);
        System.out.println("Vier: " + vier);
        System.out.println("Fünf: " + fuenf);
        System.out.println("Sechs: " + sechs);
        System.out.println("------------------");
        System.out.println("Summe: " + summe);
    }
}
