package alexis.breuse.SimpleFactory.factories;

import alexis.breuse.cars.Car;
import alexis.breuse.cars.Seat;
import alexis.breuse.cars.Skoda;
import alexis.breuse.cars.details.Brand;
import alexis.breuse.SimpleFactory.exceptions.NoCarBrandFoundException;

public class SimpleCarFactory {

    public static Car createCar(Brand brand) throws NoCarBrandFoundException {
        Car car = null;

        if(brand == Brand.SKODA)
            car = new Skoda();

        else if(brand == Brand.SEAT)
            car = new Seat();

        if(car == null)
            throw new NoCarBrandFoundException("The following brand does not exist : " + brand);

        return car;
    }

}
