package com.factory.abst;

public class DellPcFactory extends PcFactory {
    @Override
    Keyboard createKeyboard() {
        return new DellKeyboard("dell");
    }

    @Override
    Mic createMic() {
        return new DellMic("dell");
    }
}
