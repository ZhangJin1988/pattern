package com.factory.method;

public class BMWCarsFactory extends CarsFactory {


    @Override
    Cars createCar() {
        return new BmwCars("BMW");
    }
}
