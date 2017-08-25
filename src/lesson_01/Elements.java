package lesson_01;

public class Elements {
    public static void main(String[] args) {
        int[] numbers = {2, 20, 5, 12, 35, 23, 34, 5635, 12523, 16325};
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] % 5 == 0 ) {
                counter1++;
            }
            if ( numbers[i] % 2 == 0 ) {
                counter2++;
            }
        }
        System.out.println("The numbers are % 5 :" + counter1);
        System.out.println("The numbers are % 2 :" + counter2);
    }
}
