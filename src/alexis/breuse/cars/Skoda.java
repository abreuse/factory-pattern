package alexis.breuse.cars;

import alexis.breuse.cars.details.Transmission;

public class Skoda extends Car {

    public Skoda() {
    }

    public Skoda(int maxSpeed, Transmission transmission, String colour) {
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.colour = colour;
    }
}
