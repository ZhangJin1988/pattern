package com.zhangjin.builder;

/**
 * Created by zhangjin on 2018/4/20.
 */
public abstract class Builder {


    protected SmartCar smartCar = new SmartCar();


    abstract void buildWheel();

    abstract void buildSteeringWheel();

    abstract void buildShell();

    abstract void buildEngine();

//    private void buildWheel(){
//        this.smartCar.setWheel("轮子装配");
//    }
//    private void buildSteeringWheel(){
//        this.smartCar.setSteeringWheel("方向盘装配");
//    }
//    private void buildShell(){
//        this.smartCar.setShell("外壳装配");
//    }
//    private void buildEngine(){
//        this.smartCar.setEngine("发动机装配");
//    }


    public SmartCar getSmartCar() {
//        this.buildEngine();
//        this.buildShell();
//        this.buildSteeringWheel();
//        this.buildWheel();
        return this.smartCar;
    }


}
