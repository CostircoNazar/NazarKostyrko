package lesson_04.Hospitality;

import java.util.Date;

public class Doctor extends OperationsStaff {
    private String speciallty;
    private String location;

    public Doctor(String title, String givenName, String middleName, String familyName, FullName name, Date birtDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages, String speciallty, String location) {
        super(title, givenName, middleName, familyName, name, birtDate, gender, homeAddress, phone, joined, education, certification, languages);
        this.speciallty = speciallty;
        this.location = location;
    }

    public Doctor(Date joined, String education, String certification, String languages, String speciallty, String location) {
        super(joined, education, certification, languages);
        this.speciallty = speciallty;
        this.location = location;
    }

    public String getSpeciallty() {
        return speciallty;
    }

    public void setSpeciallty(String speciallty) {
        this.speciallty = speciallty;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciallty='" + speciallty + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
