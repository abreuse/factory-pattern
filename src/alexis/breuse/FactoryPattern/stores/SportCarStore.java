package alexis.breuse.FactoryPattern.stores;

import alexis.breuse.cars.Car;

public abstract class SportCarStore {

    public Car buildSportCar() {
        return createSportCar().putWheels().putTransmission().colourCar();
    }

    public abstract Car createSportCar();
}
