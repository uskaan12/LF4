package bz.berufsschule.test_sem2_2;

public class Main1 {
    public static void main(String[] args) {
        ZahlenSieb.sortieren(5, 2, 3);
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100) + 1;
        }
        ZahlenSieb.filtern(array1, 10);
    }
}
