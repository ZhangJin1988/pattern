package com.singleton;


//懒汉式  是 进来的时候 才创建
public class LazySingleton {


    private static LazySingleton instance;

    //私有构造方法
    private LazySingleton() {

    }


    public static LazySingleton getInstance() {

        if (instance == null) {

            instance = new LazySingleton();

        }
        return instance;

    }


}
