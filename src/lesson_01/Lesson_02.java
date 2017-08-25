package lesson_01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_02 {
            public static void main(String[] args) {
        /*
        В масиві зберігаються дані про загальну вартість товарів, проданих
компанією за кожний день березня. Визначити кількість днів, в
яких вартість проданих товарів перевищує значення s.
         */

                float[] sales = new float[31];
                Random random = new Random();
                float s;
                Scanner input = new Scanner(System.in);
                int counter = 0;

                for (int i = 0; i < sales.length; i++) {
                    sales[i] = random.nextInt(6000) + random.nextFloat();
                }
                Arrays.sort(sales);

        for (int i = 0; i < sales.length; i++) {
            System.out.println("sale[" + i + "] = " + sales[i]);
        }
        System.out.print("Please enter minimum sales value:");
        s = input.nextFloat();

        for (int i = 0; i < sales.length; i++) {
            if ( sales[i] > s ) counter++;
        }
        System.out.println("The quantity of days more then "+s+ "is:" + counter);


    }
}
