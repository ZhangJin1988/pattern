package com.factory.abst;

public class HpMic extends Mic {

    public HpMic(String name) {
        super(name);
    }

    @Override
    void useMic() {
        System.out.println("use Hp mic");
    }
}
