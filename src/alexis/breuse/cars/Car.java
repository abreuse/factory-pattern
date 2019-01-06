package alexis.breuse.cars;

import alexis.breuse.cars.details.Transmission;

public abstract class Car {
    protected int maxSpeed;

    protected Transmission transmission;

    protected String colour;


    public Car putWheels() {
        System.out.println("putting wheels...");
        return this;
    }

    public Car putTransmission() {
        System.out.println("putting transmission...");
        return this;
    }

    public Car colourCar() {
        System.out.println("Colouring car...");
        return this;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
