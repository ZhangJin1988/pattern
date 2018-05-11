package com.factory.sample;

/**
 * 工厂设计模式
 * 简单工厂 直接通过条件判断 来新建bean
 * 工厂方法模式   单个抽象工厂类 只能生产一种类型的bean 和 产品
 * 抽象工厂方法模式  单个抽象工厂类 可以生产 一种产品系列的产品
 */
public class SampleMouseFactory {


    public static Mouse getMouseByName(String name) {


        if (name == null && name.equals("")) {
            return null;
        } else if (name.equals("hp")) {
            return new HpMouse("hp");
        } else if (name.equals("dell")) {
            return new DellMouse("dell");
        }

        return null;


    }
}
