package com.pattern.factory.function;


import com.pattern.factory.bean.Milk;
import com.pattern.factory.bean.Yili;

/**
 * Created by Tom on 2018/3/4.
 */
public class YiliFactory implements Factory {

    public Milk getMilk() {
        return new Yili();
    }
}
