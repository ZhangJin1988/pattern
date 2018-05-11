package com.factory.sample;

public abstract class Mouse {


    private String name;
    abstract void move();

    public Mouse(String name) {
        this.name = name;
    }
}
