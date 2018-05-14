package com.singleton;


/**
 * 饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();


    public static HungrySingleton getInstance() {
        return instance;
    }


}
