package bz.berufsschule.static_methods;

import bz.berufsschule.utils.ArrayUtils;
import bz.berufsschule.utils.FileUtils;

public class bspFileWriter {
    public static void main(String[] args) {
        FileUtils.CreateFile("test.txt");
        //FileUtils.writeTextToFile("test.txt", "Hello World!");
        int[] array = {2,3,5,7,43,6,8};
        ArrayUtils.writeArrayToFile("test.txt",array);
        String text = FileUtils.textFromFile("login.txt");
        System.out.println(text);
    }
}
