package bz.berufsschule.utils;

public class euroUtils {
    public static int pruefziffer(String Seriennummer) {
        char[] char_array = new char[Seriennummer.length()];
        for (int i = 0; i < Seriennummer.length(); i++) {
            char_array[i] = Seriennummer.charAt(i);
        }
        int temp = char_array[0] - 64;
        for (int i = 1; i < char_array.length; i++) {
            temp = temp + Character.getNumericValue(char_array[i]);
        }
        int temp2 = temp % 9;
        int erg_temp = 8-temp2;

        int erg;
        if (erg_temp == 0) {
            erg = 9;
        } else {
            erg = erg_temp;
        }
        return erg;
    }
}
