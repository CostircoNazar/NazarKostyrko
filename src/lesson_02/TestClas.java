package lesson_02;

public class TestClas {
    public static void main(String[] args) {
        Person[] staff = new Person[10];
        for (int i = 0; i <staff.length ; i++) {
            staff[i] = new Person();
            System.out.println(staff[i].toString());
        }

        //System.out.println("Next id = "+Person.getNextId());




    }
}
