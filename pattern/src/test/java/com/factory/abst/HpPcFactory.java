package com.factory.abst;

public class HpPcFactory extends PcFactory {
    @Override
    Keyboard createKeyboard() {
        return new HpKeyboard("hp");
    }

    @Override
    Mic createMic() {
        return new HpMic("hp");
    }
}
