package com.factory.method;

public class BmwCars extends Cars {
    public BmwCars(String carName) {
        super(carName);
    }

    @Override
    void move() {

        System.out.println("BMW moving");
    }
}
