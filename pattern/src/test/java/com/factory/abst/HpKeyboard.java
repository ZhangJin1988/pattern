package com.factory.abst;

public class HpKeyboard extends Keyboard {


    public HpKeyboard(String name) {
        super(name);
    }

    @Override
    void useKeyboard() {

        System.out.println("use hp keyboard");
    }
}
