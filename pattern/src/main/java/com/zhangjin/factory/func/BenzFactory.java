package com.zhangjin.factory.func;

import com.zhangjin.factory.bean.Benz;
import com.zhangjin.factory.bean.Car;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
