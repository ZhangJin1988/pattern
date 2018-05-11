package com.factory.abst;

public class DellMic extends Mic {
    @Override
    void useMic() {

        System.out.println("use dell mic");
    }

    public DellMic(String name) {
        super(name);
    }
}
