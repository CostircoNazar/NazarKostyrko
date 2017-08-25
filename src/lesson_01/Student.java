package lesson_01;

/*Відомий ріст 30 студентів ВНЗ. Скільки із них має ріст більше
        170см? Чи можна сформувати баскетбольну команду (в команді
        повинно бути не менше п’яти чоловік ростом більше 170см.)*/

import java.util.Random;

public class Student {
    public static void main(String[] args) {
        int[] stNumber = new int[30];

        Random random = new Random();
        for (int i = 0; i < stNumber.length; i++) stNumber[i] = random.nextInt(220);
        for (int i = 0; i < stNumber.length; i++)
            System.out.println("The height of student " + i + " is:" + stNumber[i]);
        int counter = 0;
        for (int i = 0; i < stNumber.length; i++) if (stNumber[i] > 170) counter += 1;

        if (counter >= 5) System.out.println("We can make a team of " + counter + " players");
        else System.out.println("We cannot make a team");

    }

}
