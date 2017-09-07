package lesson_04.Hospitality;

public class FullName {
    private String name;

    public FullName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + name + '\'' +
                '}';
    }
}
