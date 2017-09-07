package lesson_02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static lesson_02.Sex.FEMALE;
import static lesson_02.Sex.MALE;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private boolean isAdult;
    //private int age;
    private Sex sex;


    public Person() {
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
        if ( name.isEmpty() ) {
            System.out.println("You entered wrong name");
        } else if ( name.length() <= 2 ) {
            System.out.println("You entered wrong name");
        }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        if ( surname.isEmpty() ) {
            System.out.println("You entered wrong name");
        } else if ( surname.length() <= 2 ) {
            System.out.println("You entered wrong name");
        }
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
        LocalDate start = getBirthday();
        LocalDate end = LocalDate.now();
        int years = (int) ChronoUnit.YEARS.between(start, end);
            System.out.println("Your age is : " + years + "old");
            if ( years < 18 ) {
                System.out.println("You need to grow up!! Kid!!" + !isAdult());
        } else {
                System.out.println("You are ready to fuck in" + years + "dude!!!");
            }
        return 0;
    }


    public Sex getSex() {
        if (sex.getSex().equals(MALE)) {
            return MALE;
        } else if (sex.getSex().equals(FEMALE)) {
            return FEMALE;
        } else {
            return sex;
        }
    }
    // second case you can use enum with (switch case);

        /*switch (sex) {
            case MALE:
                System.out.println("You are male");
                break;

            case FEMALE:
                System.out.println("You are female");
                break;

            default:
                System.out.println("You should be someone of them");
                break;
        }
        return sex;

    }*/

    public void setSex(Sex sex) {
    this.sex = sex;
    }

    public abstract void showFullInfo();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", isAdult=" + isAdult +
                ", sex=" + sex +
                '}';
    }
}
