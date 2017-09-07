package lesson_04.Hospitality;

import java.util.Date;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName name;
    private Date birtDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;

    public Person(String title, String givenName, String middleName, String familyName, FullName name, Date birtDate, Gender gender, Address homeAddress, Phone phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birtDate = birtDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    public Person() {
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birtDate = birtDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
