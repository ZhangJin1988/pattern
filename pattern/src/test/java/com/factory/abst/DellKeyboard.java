package com.factory.abst;

public class DellKeyboard extends Keyboard {
    @Override
    void useKeyboard() {

        System.out.println("use dell keyboard");
    }


    public DellKeyboard(String name) {
        super(name);
    }
}

