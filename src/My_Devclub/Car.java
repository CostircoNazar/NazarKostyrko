package My_Devclub;

import My_Devclub.OutOfFuelExeption.OutOfFuelExeption;
import My_Devclub.ToMuchFuelExeption.ToMuchFuelExeption;

public class Car {
    private double fuelAmount;
    private double fuelCapacity;
    private double fuelConsuption;
    private Point location;
    private String model;

    public Car(double fuelCapacity, double fuelConsuption, double location, String model) {
        this.fuelAmount = fuelAmount;
        this.fuelCapacity = 60.0;
        this.fuelConsuption = 0.6;
        this.location = new Point(0, 0);
        this.model = "Mercedes";
    }

    public Car() {
        this.fuelAmount = 60.0;
        this.fuelCapacity = 60.0;
        this.fuelConsuption = 0.6;
        this.location = new Point(0, 0);
        this.model = "Mercedes";
}

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public Point getLocation() {
        return location;
    }

    public String getModel() {
        return model;
    }

    public void drive(Point destination) throws OutOfFuelExeption {
        double newLocation = location.distance(destination);
        double fuelNeed = fuelConsuption * newLocation;

        if ( fuelCapacity < fuelNeed ) {
            throw new OutOfFuelExeption();
        }

        fuelAmount -= fuelNeed;
        location = destination;

        System.out.println("Car traveled");

    }

    public void drive(double x, double y) throws OutOfFuelExeption {
        drive(new Point(x, y));
    }

    public void refill(double fuel) throws  ToMuchFuelExeption {
        double fuelNeed = fuelCapacity - fuelAmount;
        if ( fuel > fuelNeed ) {
            throw new ToMuchFuelExeption();
        }
        fuelAmount += fuel;
        System.out.println("Car was successfully refiled");
    }

    public String toString(String s) {
        return s;
    }
}
