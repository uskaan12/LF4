package bz.berufsschule.arrays.mehrdimensionale_arrays;
//erstellle eine 1x1 tabelle mit eine zweidimensionale array, die letzte zahl soll 100 sein
public class beispiel2 {
    public static void main(String[] args) {
        int[][] array2d = new int[10][10];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (i + 1) * (j + 1);
                if (j == 0)
                    System.out.print("|");
                System.out.print(array2d[i][j] + "|");
            }
            System.out.println();
        }
    }
}
