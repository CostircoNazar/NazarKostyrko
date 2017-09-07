package lesson_04.Hospitality;

import java.util.Date;

public class Patient extends Person{
    private static String id;
    private Integer age;
    private History sickness;
    private String prescriptions;
    private String allergies;
    private String specialReqs;

    public Patient () {}

    public Patient(Integer age, History sickness, String prescriptions, String allergies, String specialReqs) {
        super();
        this.age = age;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Patient.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public History getSickness() {
        return sickness;
    }

    public void setSickness(History sickness) {
        this.sickness = sickness;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getSpecialReqs() {
        return specialReqs;
    }

    public void setSpecialReqs(String specialReqs) {
        this.specialReqs = specialReqs;
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
        return "Patient{" +
                "age=" + age +
                ", sickness=" + sickness +
                ", prescriptions='" + prescriptions + '\'' +
                ", allergies='" + allergies + '\'' +
                ", specialReqs='" + specialReqs + '\'' +
                '}';
    }
}
