package com.zhangjin.singleton;

/**
 * Created by zhangjin on 2018/4/21.
 */
public class HungrySingleton {


    private static HungrySingleton instance = new HungrySingleton();


    private  HungrySingleton(){

    }

    public static  HungrySingleton getInstance(){
        return instance;
    }

}
