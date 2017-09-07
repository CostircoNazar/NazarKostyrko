package lesson_04;

import java.util.ArrayList;

public class lesson_4_2 {
    public static void main(String[] args) {
        ArrayList<Student> group = new ArrayList<>();
       // group.add(new Student());
        group.add(new State());
        //group.add(new Student());
        group.add(new State());


        for (Student student:group) {
            if (student instanceof State){
                ((State) student).getSalary();
                System.out.println(student.toString());
            }
        }

    }
}
