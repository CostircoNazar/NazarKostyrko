package lesson_04.Hospitality;

public class Department extends Hospital{
    public Department(String name, Address address, Phone phone) {
        super(name, address, phone);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(Address address) {
        super.setAddress(address);
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
        return super.toString();
    }
}
