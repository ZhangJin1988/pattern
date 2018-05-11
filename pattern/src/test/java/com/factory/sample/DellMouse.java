package com.factory.sample;

public class DellMouse extends Mouse {
    public DellMouse(String name) {
        super(name);
    }

    @Override
    void move() {

        System.out.println("dell mouse move");
    }
}
