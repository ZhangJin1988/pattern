package com.pattern.factory.abst;


import com.pattern.factory.bean.*;

/**
 * Created by Tom on 2018/3/4.
 */
public class MilkFactory extends AbstractFactory {


    public Milk getMengniu() {
        return new Mengniu();
    }

    public Milk getYili() {
        return new Yili();
    }

    public Milk getTelunsu() {
        return new Telunsu();
    }

    public Milk getSanlu() {
        return new Sanlu();
    }
}
