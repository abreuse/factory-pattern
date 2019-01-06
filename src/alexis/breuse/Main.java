package alexis.breuse;

import alexis.breuse.cars.Car;
import alexis.breuse.cars.details.Brand;
import alexis.breuse.stores.CarStore;
import alexis.breuse.exceptions.NoCarBrandFoundException;

public class Main {

    public static void main(String[] args) throws NoCarBrandFoundException {
	    CarStore carStore = new CarStore();

	    Car skoda = carStore.build(Brand.SKODA);
	    Car seat = carStore.build(Brand.SEAT);
	    //Car renault = carStore.build("Renault");
    }
}
