package PostSystem;



public class PostBox extends Box {
    private String address;
    private Person sender;
    private Person receiver;

    public PostBox() {
        this.address = "";
        this.sender = new Person();
        this.receiver = new Person();
    }

    public PostBox(int hight, int width, int length,
                   String address, Person sender, Person receiver) {
        super(hight, width, length);
        this.address = address;
        this.sender = sender;
        this.receiver = receiver;
    }

    public PostBox(Box obj, String address, Person sender, Person receiver) {
        super(obj);
        this.address = address;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "PostBox{" +
                "address='" + address + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
