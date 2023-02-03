package bz.berufsschule.arrays.eindimensionale_arrrays;

/*
Erstelle ein Integer-Array der Länge 10 und fülle es mit Zufallszahlen zwischen 1 und 100.
Anschließend zähle wie viele Zahlen größer als 50 sind und gib das Ergebnis in der Konsole aus.
 */
public class bsp2 {
    public static void main(String[] args) {
        // Erstelle ein Integer-Array der Länge 10
        int[] array = new int[10];
        // Fülle es mit Zufallszahlen zwischen 1 und 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        // Zählt wie viele Zahlen größer als 50 sind
        int counter = 0;
        for (int num : array) {
            if (num > 50) {
                counter++;
            }
        }
        // Gibt das Ergebnis in der Konsole aus
        System.out.println("Im Array sind "+counter + " Zahlen größer als 50.");
    }
}
