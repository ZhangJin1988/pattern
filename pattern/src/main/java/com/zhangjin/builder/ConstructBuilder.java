package com.zhangjin.builder;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class ConstructBuilder extends Builder {
//
//
//
//
//
//
//     void buildWheel(){
//        super.smartCar.setWheel("轮子装配");
//    }
//     void buildSteeringWheel(){
//        this.smartCar.setSteeringWheel("方向盘装配");
//    }
//     void buildShell(){
//        this.smartCar.setShell("外壳装配");
//    }
//     void buildEngine(){
//        this.smartCar.setEngine("发动机装配");
//    }


    @Override
    void buildWheel() {
        super.smartCar.setWheel("宝马轮子");
    }

    @Override
    void buildSteeringWheel() {
        this.smartCar.setSteeringWheel("宝马方向盘");
    }

    @Override
    void buildShell() {
        this.smartCar.setShell("宝马外型");

    }

    @Override
    void buildEngine() {
        this.smartCar.setEngine("宝马的引擎");
    }

//    public SmartCar getSmartCar(){
//        this.buildEngine();
//        this.buildShell();
//        this.buildSteeringWheel();
//        this.buildWheel();
//        return this.smartCar;
//    }

}
