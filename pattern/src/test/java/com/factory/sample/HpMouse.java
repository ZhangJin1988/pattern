package com.factory.sample;

public class HpMouse extends Mouse {

    public HpMouse(String name) {
        super(name);
    }

    @Override
    void move() {

        System.out.println(" Hp mouse move");
    }
}
