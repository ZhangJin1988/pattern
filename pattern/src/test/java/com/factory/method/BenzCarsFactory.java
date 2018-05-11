package com.factory.method;

public class BenzCarsFactory extends CarsFactory {
    @Override
    Cars createCar() {
        return new BenzCars("Benz");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
