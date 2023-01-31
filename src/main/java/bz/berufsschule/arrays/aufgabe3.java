package bz.berufsschule.arrays;

public class aufgabe3 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5};
        int temp = myNumbers[myNumbers.length - 1];

        for (int i = myNumbers.length - 1; i > 0; i--) {
            myNumbers[i] = myNumbers[i - 1];
        }

        myNumbers[0] = temp;

        for (int number : myNumbers) {
            System.out.print(number + " ");
        }
    }
}
