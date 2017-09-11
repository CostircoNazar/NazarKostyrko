package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class LogBook {
    private int id;
    private ArrayList<Subject> subjects;

    public LogBook() {
        this.id = 0;
        this.subjects = Subject.getInstanceOfArray();
    }

    public LogBook(int id, ArrayList<Subject> subjects) {
        this.id = id;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setSubjects(Subject subject) {
        subjects.add(subject);
    }

    public void setSubjects() {
        Subject tempSub = Subject.getInstanceOfSingle();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter subject name: ");
        tempSub.setName(input.next());
        System.out.println("1 - Lection\n2 - Practical\n3 - Labour");
        System.out.print("Please select subject type from list: ");

        switch (input.nextInt()){
            case 0: tempSub.setSubjectType(SubjectType.Lection); break;
            case 1: tempSub.setSubjectType(SubjectType.Practice); break;
            case 2: tempSub.setSubjectType(SubjectType.Labour); break;
        }

        subjects.add(tempSub);

    }

    @Override
    public String toString() {
        return "LogBook{" +
                "id=" + id +
                ", subjects=" + subjects +
                '}';
    }

    public static LogBook getInstanceOf(){
        return new LogBook();
    }
}
