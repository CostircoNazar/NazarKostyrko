package lesson_01;

public class Gun {
    private int amount;
    private int capacity;
    boolean isReady;
    private String model;
    private int totalShots;

    public Gun(String model, int capacity) {
        this.capacity = 8;
        this.model = "Beretta";
        this.isReady = true;
        this.totalShots = 0;
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean ready() {
        return !isReady;
    }

    public String getModel() {
        return model;
    }

    public int getTotalShots() {
        return totalShots;
    }

    public void prepare() {
        if (!isReady) isReady = true;
        else isReady = false;
    }

    public void reload() {
        amount = capacity;
    }

    public void shoot() throws NotReadyExeption, OutOfRoundsExeption {
        if ( !ready() ) {
            throw new NotReadyExeption();
        }
        if ( amount == 0 ) {
            isReady = false;
            throw new OutOfRoundsExeption();
        }
        amount -= 1;
        totalShots += 1;
        System.out.println("Bang");
    }




}
