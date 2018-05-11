package com.factory.method;

public abstract class Cars {

    public Cars(String carName) {
        this.carName = carName;
    }

    private String carName;

    abstract void move();
}
