package bz.berufsschule.arrays.mehrdimensionale_arrays;
/*
erstelle ein Programm, das eine 10x10 Matrix mit Zufallszahlen
zwischen 40 unf 500 füllt und anschließend die Summe der
Zahlen in der Diagonale von oben nach unten und von unten
nach oben berechnet.
*/

public class wiederholungsaufgabe1 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 461 + 40);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]+ "\t");
            }
        }

        //Summe der Zahlen in der Diagonale von oben nach unten
        int total1 = 0;
        for (int i = 0; i < array.length; i++) {
            total1 += array[i][i];
        }
        System.out.println("Summer der ersten Diagonale lautet: " + total1);

        //
        int total2 = 0;
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            total2 += array[i][j];
            j--;
        }
        System.out.println("Summer der zweiten Diagonale lautet: " + total2);
    }
}

