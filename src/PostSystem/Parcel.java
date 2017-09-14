package PostSystem;

public class Parcel extends PostBox {
    private double weight;
    private double price;

    public Parcel(double weight) {
        this.weight = weight;
        this.price = setPrice();
    }

    public Parcel(int hight, int width, int length, String address,
                  Person sender, Person receiver, double weight) {
        super(hight, width, length, address, sender, receiver);
        this.weight = weight;
        this.price = setPrice();
    }

    public Parcel(Box obj, String address, Person sender,
                  Person receiver, double weight ) {
        super(obj, address, sender, receiver);
        this.weight = weight;
        this.price = setPrice();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double setPrice() {
        double coef = 1;

        if ( weight < 10 ) {
            coef = 2.0;
        } else if (weight > 10) {
            coef = 4.0;
        }

        return weight * coef;
    }





}
