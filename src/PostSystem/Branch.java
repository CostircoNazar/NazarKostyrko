package PostSystem;

import java.util.ArrayList;

public class Branch extends DeliverySystem {
    private int id;
    private static int nextId = 1;
    private String address;
    private ArrayList<Parcel> sentList = new ArrayList<>();
    private ArrayList<Parcel> receivedList = new ArrayList<>();

    public Branch(String address) {
        this.address = address;
        setId();
    }

    public Branch() {
        this.address = " ";
        setId();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean sent(Parcel obj) {
        return sentList.add(obj);
    }

    @Override
    public boolean receive(Parcel obj) {
        if (receivedList.contains(obj)) {
            receivedList.remove(obj);
            return true;
        }
        return false;
    }

    @Override
    public boolean track(int id) {
        return false;
    }
}
