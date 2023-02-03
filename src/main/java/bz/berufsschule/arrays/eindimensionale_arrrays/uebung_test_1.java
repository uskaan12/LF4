package bz.berufsschule.arrays.eindimensionale_arrrays;

import java.util.Random;

public class uebung_test_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random zufall = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = zufall.nextInt(201) - 100;
        }

        int positiv = 0;
        int negativ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativ++;
            } else if (array[i] > 0) {
                positiv++;
            }
        }
        for (int i=0; i< array.length;i++){
            System.out.print(array[i] + ", ");
            if(i==array.length -1){
                System.out.println(array[i]);
            }
        }
        System.out.println("Anzahl negative Zahlen: " + negativ);
        System.out.println("Anzahl positive Zahlen: " + positiv);
    }
}
