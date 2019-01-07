package alexis.breuse.FactoryPattern.stores;

import alexis.breuse.cars.Car;
import alexis.breuse.cars.SkodaSport;

public class SkodaSportCarStore extends SportCarStore {

    @Override
    public Car buildSportCar() {
        System.out.println("\nBuilding a Skoda sport car");
        return super.buildSportCar();
    }

    @Override
    public Car createSportCar() {
        return new SkodaSport();
    }
}
