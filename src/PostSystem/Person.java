package PostSystem;

public class Person {
    private String name;
    private String surname;


    public Person() {
        name = "";
        surname = "";
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkDetails())
            this.name = name;
    }

    public String getSurname() {
        return surname;

    }

    private boolean checkDetails() {
        if (getName().isEmpty() || getSurname().isEmpty() ||
                getSurname().length() <= 2 || getName().length() <= 2) {
            System.out.println("Wrong input data");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
