package com.pattern.factory.function;


import com.pattern.factory.bean.Milk;
import com.pattern.factory.bean.Telunsu;

/**
 * 事情变得越来越专业
 * Created by Tom on 2018/3/4.
 */
public class TelunsuFactory implements Factory {

    public Milk getMilk() {
        return new Telunsu();
    }
}
