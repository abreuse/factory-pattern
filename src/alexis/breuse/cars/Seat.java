package alexis.breuse.cars;

import alexis.breuse.cars.details.Transmission;

public class Seat extends Car {

    public Seat() {
    }

    public Seat(int maxSpeed, Transmission transmission, String colour) {
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.colour = colour;
    }

}
