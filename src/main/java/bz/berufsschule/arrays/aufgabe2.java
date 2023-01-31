package bz.berufsschule.arrays;
import java.util.Random;
public class aufgabe2 {
    public static void main(String[] args) {
        int[] numbers = new int[25];
        Random random = new Random();
        boolean[] found = new boolean[9];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1;
            found[numbers[i] - 1] = true;
        }

        for (int i = 0; i < found.length; i++) {
            if (!found[i]) {
                System.out.println("Es sind nicht alle Zahlen von 1 bis 9 vorhanden");
                return;
            }
        }

        System.out.println("Es sind alle Zahlen von 1 bis 9 vorhanden");
    }
}
