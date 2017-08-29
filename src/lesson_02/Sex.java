package lesson_02;

public enum Sex { //MALE, FEMALE
    MALE("Male"), FEMALE("Female");

    private String sex;

    Sex(String sex) { // Why this constructor cannot be public?
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }



}
