package lesson_02;

public class lesson2_1 {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        for (int i = 0; i <people.length ; i++) {
            System.out.println(people[i].toString());
        }

        for(Person human:people){
            System.out.println(human.toString());
        }
    }
}
