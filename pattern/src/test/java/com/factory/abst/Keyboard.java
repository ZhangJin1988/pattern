package com.factory.abst;

public abstract class Keyboard {


    public Keyboard(String name) {
        this.name = name;
    }

    private String name;

    abstract void useKeyboard();
}
