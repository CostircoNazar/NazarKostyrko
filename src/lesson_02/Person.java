package lesson_02;

import java.time.LocalDate;


public class Person {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private boolean isAdult;
    //private int age;
    private Sex sex;

    {
        id  = nextId;
        nextId++;
    }

    public Person() {
        name = "no name";
    }

    public Person(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Person(String name, String surname, LocalDate birthday, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }


    public int getAge() {
        LocalDate now = LocalDate.now();
        //Period age =


        if ( birthday.getYear() < 18 ) {
            System.out.println("You need to grow up!!!!" + ! isAdult());
        }

        return 0;
    }


    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static Person getInstance(){
        return  new Person();
    }

    public static Person[] getArrayInstance(int size){
        return  new Person[size];
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", isAdult=" + isAdult +
                ", sex=" + sex +
                '}';
    }
}
