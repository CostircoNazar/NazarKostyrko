package lesson_04;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int id;
    private SubjectType subjectType;

    public Subject() {
        this.name = "";
        this.id = 0;
        this.subjectType = SubjectType.Lection;
    }

    public Subject(String name, int id, SubjectType subjectType) {
        this.name = name;
        this.id = id;
        this.subjectType = subjectType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subjectType=" + subjectType +
                '}';
    }

    public static ArrayList<Subject> getInstanceOfArray(){
        return  new ArrayList<>();
    }

    public static Subject getInstanceOfSingle(){
        return  new Subject();
    }
}
