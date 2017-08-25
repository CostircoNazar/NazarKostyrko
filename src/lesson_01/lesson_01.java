package lesson_01;

import java.util.Scanner;

import static java.lang.Math.*;

public class lesson_01 {
    public static void main(String[] args) {
        /*
        byte short int long
        float double
        char
        boolean*/
        Scanner input = new Scanner(System.in);
        int phoneNumber  =10;
        String name;
        final double PI = 3.14;

        sqrt(PI);

        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Hello "+name);



    }
}
