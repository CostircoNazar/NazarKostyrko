package lesson_04.Hospitality;

import java.util.Date;

public class Surgeon extends Doctor {
    public Surgeon(String title, String givenName, String middleName, String familyName, FullName name, Date birtDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages, String speciallty, String location) {
        super(title, givenName, middleName, familyName, name, birtDate, gender, homeAddress, phone, joined, education, certification, languages, speciallty, location);
    }

    public Surgeon(Date joined, String education, String certification, String languages, String speciallty, String location) {
        super(joined, education, certification, languages, speciallty, location);
    }


}
