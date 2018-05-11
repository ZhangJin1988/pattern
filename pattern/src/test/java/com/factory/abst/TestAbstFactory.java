package com.factory.abst;

public class TestAbstFactory {


    public static void main(String[] args) {


        DellPcFactory dellPcFactory = new DellPcFactory();
        Keyboard keyboard = dellPcFactory.createKeyboard();
        keyboard.useKeyboard();
        Mic mic = dellPcFactory.createMic();
        mic.useMic();

        HpPcFactory hpPcFactory = new HpPcFactory();
        Keyboard keyboard1 = hpPcFactory.createKeyboard();
        keyboard1.useKeyboard();
        Mic mic1 = hpPcFactory.createMic();
        mic1.useMic();


    }
}
