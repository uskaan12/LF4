package bz.berufsschule.test3;

public class aufgabe3 {
    public static void main(String[] args) {
        //array with temps
        int[] array = {12, 14, 10, 7, 11, 13, 12, 15, 15, 18, 16, 13, 10, 12};
        //some variables
        int temp_difference;
        int max_temp_difference = 0;
        for (int i = 0; i < array.length; i++) {
            //reads & prints array
            System.out.println("Tag: " + i + " Temperatur: " + array[i] + "°C");
            //gets temp diff
            if (i != 0) {
                temp_difference = array[i] - array[i - 1];
                //makes diff positive
                if (temp_difference < 0) {
                    temp_difference = temp_difference * -1;
                }
                //saves max diff
                if (temp_difference > max_temp_difference) {
                    max_temp_difference = temp_difference;
                }
            }
        }
        //prints needed stuff
        System.out.println(" ");
        System.out.println("Größter Temperaturunterschied: " + max_temp_difference + "°C");
    }
}
