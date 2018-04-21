package com.zhangjin.builder;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class Director {


    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }


    public SmartCar construct() {

        builder.buildWheel();
        builder.buildSteeringWheel();
        builder.buildShell();
        builder.buildEngine();
        return builder.getSmartCar();
    }


    public static void main(String[] args) {


        ConstructBuilder builder = new ConstructBuilder();
        Director director = new Director(builder);

        SmartCar construct = director.construct();
        System.out.println(construct);
    }


}
