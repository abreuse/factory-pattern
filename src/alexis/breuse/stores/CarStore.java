package alexis.breuse.stores;

import alexis.breuse.cars.Car;
import alexis.breuse.cars.details.Brand;
import alexis.breuse.exceptions.NoCarBrandFoundException;
import alexis.breuse.factories.SimpleCarFactory;

public class CarStore {

    public Car build(Brand brand) throws NoCarBrandFoundException {
        System.out.println("\nBuilding a " + brand + " car : ");
        Car car = SimpleCarFactory.createCar(brand);
        return car.putWheels().putTransmission().colourCar();
    }
}
