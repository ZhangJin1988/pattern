package com.pattern.factory.function;


import com.pattern.factory.bean.Mengniu;
import com.pattern.factory.bean.Milk;

/**
 * Created by Tom on 2018/3/4.
 */
public class MengniuFactory implements  Factory {


    public Milk getMilk() {
        return new Mengniu();
    }
}
