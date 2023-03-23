package bz.berufsschule.utils;

public class Kryptograph {
    public static String verschluesseln(String text, int schluessel) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] = (char) (array[i] - schluessel));
        }
        return String.valueOf(array);
    }

    public static String entschluesseln(String text, int schluessel){
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] = (char) (array[i] + schluessel));
        }
        return String.valueOf(array);
    }
}
