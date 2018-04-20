package com.zhangjin.builder;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class SmartCar {

    private String wheel;
    private String SteeringWheel;
    private String Engine;
    private String Shell;


    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        SteeringWheel = steeringWheel;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getShell() {
        return Shell;
    }

    public void setShell(String shell) {
        Shell = shell;
    }


    @Override
    public String toString() {
        return "SmartCar{" +
                "wheel='" + wheel + '\'' +
                ", SteeringWheel='" + SteeringWheel + '\'' +
                ", Engine='" + Engine + '\'' +
                ", Shell='" + Shell + '\'' +
                '}';
    }
}
