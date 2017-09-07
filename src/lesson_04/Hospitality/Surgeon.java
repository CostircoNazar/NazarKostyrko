package lesson_04.Hospitality;

import java.util.Date;

public class Surgeon extends Doctor {
    public Surgeon(String title, String givenName, String middleName, String familyName, FullName name, Date birtDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages, String speciallty, String location) {
        super(title, givenName, middleName, familyName, name, birtDate, gender, homeAddress, phone, joined, education, certification, languages, speciallty, location);
    }

    public Surgeon(Date joined, String education, String certification, String languages, String speciallty, String location) {
        super(joined, education, certification, languages, speciallty, location);
    }

    @Override
    public String getSpeciallty() {
        return super.getSpeciallty();
    }

    @Override
    public void setSpeciallty(String speciallty) {
        super.setSpeciallty(speciallty);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Date getJoined() {
        return super.getJoined();
    }

    @Override
    public void setJoined(Date joined) {
        super.setJoined(joined);
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public void setEducation(String education) {
        super.setEducation(education);
    }

    @Override
    public String getCertification() {
        return super.getCertification();
    }

    @Override
    public void setCertification(String certification) {
        super.setCertification(certification);
    }

    @Override
    public String getLanguages() {
        return super.getLanguages();
    }

    @Override
    public void setLanguages(String languages) {
        super.setLanguages(languages);
    }
}
