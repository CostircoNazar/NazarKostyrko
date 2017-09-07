package lesson_04.Hospitality;

import java.util.Date;

public class Staff extends Person {
    private Date joined;
    private String education;
    private String certification;
    private String languages;

    public Staff(String title, String givenName, String middleName, String familyName, FullName name, Date birtDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages) {
        super(title, givenName, middleName, familyName, name, birtDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public Staff(Date joined, String education, String certification, String languages) {
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "joined=" + joined +
                ", education='" + education + '\'' +
                ", certification='" + certification + '\'' +
                ", languages='" + languages + '\'' +
                '}';
    }
}
