package bz.berufsschule.arrays.mehrdimensionale_arrays;
/*
    * Erstelle ein 3x3 Bingo Array mit Zahlen von 10 bis 40
    * Jede Runde wird eine neue Zahl gezogen und überprüft ob sie im Array vorhanden ist
    * sobald der Spieler drei Zahlen in der Horizontale oder in der Vertikalen oder in der Diagonale hat, hat er gewonnen(BINGO!)
    * Der Spieler wird am ende gefragt ob er nochmal spielen möchte oder nicht
 */
public class bingo_einfach {
    public static void main(String[] args) {
        int[][] bingo = new int[3][3];
        //fills array with random numbers from 10 to 40
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                bingo[i][j] = (int) (Math.random() * 31) + 10;
            }
        }
        //prints array
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + " ");
            }
            System.out.println();
        }
        //checks if the player has won


    }
}
