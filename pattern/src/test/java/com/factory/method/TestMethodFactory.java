package com.factory.method;

public class TestMethodFactory {

    public static void main(String[] args) {


        BMWCarsFactory bmwCarsFactory = new BMWCarsFactory();

        Cars car = bmwCarsFactory.createCar();
        car.move();

        BenzCarsFactory benzCarsFactory = new BenzCarsFactory();
        Cars car1 = benzCarsFactory.createCar();
        car1.move();


    }
}
