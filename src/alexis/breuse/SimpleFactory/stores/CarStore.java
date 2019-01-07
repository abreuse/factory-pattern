package alexis.breuse.SimpleFactory.stores;

import alexis.breuse.cars.Car;
import alexis.breuse.cars.details.Brand;
import alexis.breuse.SimpleFactory.exceptions.NoCarBrandFoundException;
import alexis.breuse.SimpleFactory.factories.SimpleCarFactory;

public class CarStore {

    public Car build(Brand brand) throws NoCarBrandFoundException {
        System.out.println("\nBuilding a " + brand + " car : ");
        Car car = SimpleCarFactory.createCar(brand);
        return car.putWheels().putTransmission().colourCar();
    }
}
