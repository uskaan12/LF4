package bz.berufsschule.arrays;

/*
 Erstelle ein Integer-Array der Länge 5 und fülle es mit den Zahlen 1 bis 5. Gib das Array aus.
 */
public class bsp1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
