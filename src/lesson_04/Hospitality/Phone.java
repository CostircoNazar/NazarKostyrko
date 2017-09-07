package lesson_04.Hospitality;

public class Phone {
    private int phone;

    public Phone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone=" + phone +
                '}';
    }
}
