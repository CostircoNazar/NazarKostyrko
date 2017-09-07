package lesson_04.Hospitality;

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
