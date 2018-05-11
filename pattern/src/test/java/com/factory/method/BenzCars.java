package com.factory.method;

public class BenzCars extends Cars {
    public BenzCars(String carName) {
        super(carName);
    }

    @Override
    void move() {

        System.out.println("benz cars moving");
    }
}
