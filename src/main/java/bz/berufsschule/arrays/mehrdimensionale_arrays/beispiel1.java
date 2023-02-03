package bz.berufsschule.arrays.mehrdimensionale_arrays;

public class beispiel1 {
    public static void main(String[] args) {
        // Das zweidimensionale Array hat 4 Zeilen und 3 Spalten wird deklariert
        int[][] array2d = new int[4][3];
        //Das zweidimensionale Array wird Initialisiert wobei i für den Index der Zeile und j für den Index der Spalte steht
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = i * j; //An die Stelle array2d[i][j] wird der Wert i*j geschrieben
                if (j == 0)
                    System.out.print("|");
                System.out.print(array2d[i][j] + "|");
            }
            System.out.println(); // Zeilenumbruch
        }
    }
}
