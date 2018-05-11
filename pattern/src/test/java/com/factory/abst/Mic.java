package com.factory.abst;

public abstract  class Mic {

    public Mic(String name) {
        this.name = name;
    }

    private String name;

    abstract void useMic();
}
