package lesson_04;

import java.util.Scanner;

public class lesson_4_1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student sst1 = new State();

        st1.deductions();
        //sst1.deductions();

        /*Student st2 = new State();
        Student st3 = sst1;*/

       //State sst2 = new Student();

        sst1 = (State) st1;

    }
}
