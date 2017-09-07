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
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getGivenName() {
        return super.getGivenName();
    }

    @Override
    public void setGivenName(String givenName) {
        super.setGivenName(givenName);
    }

    @Override
    public String getMiddleName() {
        return super.getMiddleName();
    }

    @Override
    public void setMiddleName(String middleName) {
        super.setMiddleName(middleName);
    }

    @Override
    public String getFamilyName() {
        return super.getFamilyName();
    }

    @Override
    public void setFamilyName(String familyName) {
        super.setFamilyName(familyName);
    }

    @Override
    public FullName getName() {
        return super.getName();
    }

    @Override
    public void setName(FullName name) {
        super.setName(name);
    }

    @Override
    public Date getBirtDate() {
        return super.getBirtDate();
    }

    @Override
    public void setBirtDate(Date birtDate) {
        super.setBirtDate(birtDate);
    }

    @Override
    public Gender getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(Gender gender) {
        super.setGender(gender);
    }

    @Override
    public Address getHomeAddress() {
        return super.getHomeAddress();
    }

    @Override
    public void setHomeAddress(Address homeAddress) {
        super.setHomeAddress(homeAddress);
    }

    @Override
    public Phone getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(Phone phone) {
        super.setPhone(phone);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciallty='" + speciallty + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
