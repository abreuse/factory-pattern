package alexis.breuse;

import alexis.breuse.FactoryPattern.stores.SeatSportCarStore;
import alexis.breuse.FactoryPattern.stores.SkodaSportCarStore;
import alexis.breuse.FactoryPattern.stores.SportCarStore;
import alexis.breuse.cars.Car;
import alexis.breuse.cars.details.Brand;
import alexis.breuse.SimpleFactory.stores.CarStore;
import alexis.breuse.SimpleFactory.exceptions.NoCarBrandFoundException;

public class Main {

    public static void main(String[] args) throws NoCarBrandFoundException {

    	// Simple Factory
	    CarStore carStore = new CarStore();

	    Car skoda = carStore.build(Brand.SKODA);
	    Car seat = carStore.build(Brand.SEAT);
	    //Car renault = carStore.build("Renault");

		//-----------------

		// Factory pattern
		SportCarStore skodaSportCarStore = new SkodaSportCarStore();
		SportCarStore seatSportCarStore = new SeatSportCarStore();

		skodaSportCarStore.buildSportCar();
		seatSportCarStore.buildSportCar();
    }
}
