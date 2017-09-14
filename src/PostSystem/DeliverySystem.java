package PostSystem;

public abstract class DeliverySystem {

    public abstract boolean sent(Parcel obj);
    public abstract boolean receive(Parcel obj);
    public abstract boolean track(int id);


}
