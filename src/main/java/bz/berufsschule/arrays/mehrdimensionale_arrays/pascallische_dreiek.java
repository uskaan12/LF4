package bz.berufsschule.arrays.mehrdimensionale_arrays;

public class pascallische_dreiek {
    // Pascal's triangle
    public static void main(String[] args) {
        int[][] pascal = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || j == 0) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i][j - 1];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10; j++) {
                if (pascal[i][j] != 0) {
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
