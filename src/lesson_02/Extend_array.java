package lesson_02;

import java.util.Arrays;

public class Extend_array {
    public static void main(String[] args) {
            int [] array = {1, 2, 3, 4, 5};
        System.out.println("The original length of array is :" + array.length);
        int end = array.length - 1;
        for (int i = 0; i < end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[end]);

        int [] newArray = Arrays.copyOf(array, 6);

        System.out.println("The new length of array : " + newArray.length);
        int last = newArray.length - 1;
        for (int i = 0; i < last; i++) {
            System.out.print(newArray[i] + " ");
        }
        newArray[last] = 10;
        System.out.println(newArray[last]);

    }
}


