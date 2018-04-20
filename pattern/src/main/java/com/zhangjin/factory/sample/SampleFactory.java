package com.zhangjin.factory.sample;

import com.zhangjin.factory.bean.BMW;
import com.zhangjin.factory.bean.Benz;
import com.zhangjin.factory.bean.Car;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class SampleFactory {


    public Car createCar(String type) {

        if (type.equals("BMW")) {
            return new BMW();
        } else if (type.equals("Benz")) {
            return new Benz();
        }
        return null;
    }
}
