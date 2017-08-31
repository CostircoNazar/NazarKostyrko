package lesson_04;

import lesson_02.Sex;

import java.time.LocalDate;

public class State extends Student {
    private double salary;
    private boolean salary_available;

    public State() {
    }

    public State(String name, String surname, LocalDate birthday, String group, int id, double salary, boolean salary_available) {
        super(name, surname, birthday, group, id);
        this.salary = salary;
        this.salary_available = salary_available;
    }

    public State(String name, String surname, LocalDate birthday, Sex sex, String group, int id, double salary, boolean salary_available) {
        super(name, surname, birthday, sex, group, id);
        this.salary = salary;
        this.salary_available = salary_available;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSalary_available() {
        return salary_available;
    }

    public void setSalary_available(boolean salary_available) {
        this.salary_available = salary_available;
    }

    @Override
    public void deductions() {
        System.out.println("State student was deducted");
    }

    @Override
    public String toString() {
        return "State{" +
                "salary=" + salary +
                ", salary_available=" + salary_available +
                "} " + super.toString();
    }
}
