package bz.berufsschule.test_sem2_1;

public class aufgabe2 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 101 + 100);
            }
        }
        int kleinste_zahl = Integer.MAX_VALUE;
        int groesste_zahl = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<kleinste_zahl){
                    kleinste_zahl = matrix[i][j];
                }
                if(matrix[i][j]>groesste_zahl){
                    groesste_zahl = matrix[i][j];
                }
            }
            System.out.println("Zeile " + i + " kleinste Zahl: " + kleinste_zahl + " größte Zahl: " + groesste_zahl);
            kleinste_zahl = Integer.MAX_VALUE;
            groesste_zahl = Integer.MIN_VALUE;
        }
    }
}
