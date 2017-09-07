package lesson_04;

import lesson_02.Person;
import lesson_02.Sex;

import java.time.LocalDate;

public abstract class Student extends Person {
private String group;
private int id;


    public Student() {
    }

    public Student(String name, String surname, LocalDate birthday, String group, int id) {
        super(name, surname, birthday);
        this.group = group;
        this.id = id;
    }

    public Student(String name, String surname, LocalDate birthday, Sex sex, String group, int id) {
        super(name, surname, birthday, sex);
        this.group = group;
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGroup() {
        String temp_g = "1";
        this.group = temp_g;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deductions(){
        System.out.println("Student was deducted");
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }
}
