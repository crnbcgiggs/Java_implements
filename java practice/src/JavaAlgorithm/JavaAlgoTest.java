package JavaAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class JavaAlgoTest {
    public static void main(String[] args) {
//        double a = Math.random();
//        System.out.println(a);
        char[] array = "柒个我国IG虎扑hialgorithm in Java课".toCharArray();
        Character[] arr = new Character[array.length];

        for (int i = 0; i < array.length; i ++) {
            arr[i] = array[i];
        }
        List<Integer> list = new ArrayList<>();
        System.out.println((int)'0');


        ArraysSort1.sort(arr);
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(" " + arr[i]);
        }
    }
}
