package bz.berufsschule.while_schleife;

import java.util.Random;

/*
Erstelle ein Programm, das 6 Lottozahlen zwischen 1 und 90 generiert. Achtung alle 6 Zahlen
müssen eine anderen wert haben.
 */
public class beispiel3 {
    public static void main(String[] args) {
        int lottozahl1 = 0, lottozahl2 = 0, lottozahl3 = 0, lottozahl4 = 0, lottozahl5 = 0, lottozahl6 = 0, lottozahl7 = 0, lottozahl8 = 0, lottozahl9 = 0;
        boolean wiederholen = true;
        Random zufall = new Random();

        while (wiederholen) {
            lottozahl1 = zufall.nextInt(90) + 1;
            lottozahl2 = zufall.nextInt(90) + 1;
            lottozahl3 = zufall.nextInt(90) + 1;
            lottozahl4 = zufall.nextInt(90) + 1;
            lottozahl5 = zufall.nextInt(90) + 1;
            lottozahl6 = zufall.nextInt(90) + 1;
            lottozahl7 = zufall.nextInt(90) + 1;
            lottozahl8 = zufall.nextInt(90) + 1;
            lottozahl9 = zufall.nextInt(90) + 1;
            if (lottozahl1 != lottozahl2 && lottozahl1 != lottozahl3 && lottozahl1 != lottozahl4 && lottozahl1 != lottozahl5 && lottozahl1 != lottozahl6 && lottozahl2 != lottozahl3 && lottozahl2 != lottozahl4 && lottozahl2 != lottozahl5 && lottozahl2 != lottozahl6 && lottozahl3 != lottozahl4 && lottozahl3 != lottozahl5 && lottozahl3 != lottozahl6 && lottozahl4 != lottozahl5 && lottozahl4 != lottozahl6 && lottozahl5 != lottozahl6) {
                wiederholen = false;
            }
        }
        System.out.println("Die heutigen Lottozahlen lauten: " + lottozahl1 + " " + lottozahl2 + " " + lottozahl3 + " " + lottozahl4 + " " + lottozahl5 + " " + lottozahl6 + " " + lottozahl7 + " " + lottozahl8 + " " + lottozahl9);
    }
}
