package alexis.breuse.FactoryPattern.stores;

import alexis.breuse.cars.Car;
import alexis.breuse.cars.SeatSport;

public class SeatSportCarStore extends SportCarStore {

    @Override
    public Car buildSportCar() {
        System.out.println("\nBuilding a Seat sport car");
        return super.buildSportCar();
    }

    @Override
    public Car createSportCar() {
        return new SeatSport();
    }
}
