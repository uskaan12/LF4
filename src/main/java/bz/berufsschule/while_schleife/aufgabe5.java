package bz.berufsschule.while_schleife;

public class aufgabe5 {
    public static void main(String[] args) {
        int zaehler = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0 || i % 8 == 0) {
                System.out.println(i + " ");
                zaehler++;
                if (zaehler == 6) {
                    System.out.println(" ");
                    zaehler = 0;
                }
            }
        }
    }
}
