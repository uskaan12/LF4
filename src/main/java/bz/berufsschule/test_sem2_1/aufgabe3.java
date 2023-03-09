package bz.berufsschule.test_sem2_1;

public class aufgabe3 {
    public static void main(String[] args) {
        int[][] matrix = new int[25][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * -199 + 100);
            }
        }
        int[] matrix2 = new int[25];
        int negativ = 0;
        int positiv = 0;
        int negativ_zeile = 0;
        int positiv_zeile = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positiv_zeile++;
                } else if (matrix[i][j] < 0) {
                    negativ_zeile++;
                }
            }
            negativ = negativ + negativ_zeile;
            positiv = positiv + positiv_zeile;
            if (positiv_zeile > negativ_zeile) {
                matrix2[i] = i;
            } else {
                matrix2[i] = 99;
            }
            positiv_zeile = 0;
            negativ_zeile = 0;
        }
        System.out.println("Es gibt " + positiv + " positive zahlen und " + negativ + " negative Zahlen");
        System.out.println(" ");
        int zeile = 0;
        for (int i = 0; i < matrix2.length; i++) {
            if (matrix2[i]==99){
            } else {
                zeile = matrix2[i] + 1;
                System.out.println("Zeile " + zeile + " hat mehr positive als negative zahlen" );
            }
        }
    }
}