package com.zhangjin.singleton;

/**
 * Created by zhangjin on 2018/4/21.
 * 懒汉式
 */
public class LazySingleton {


    private static LazySingleton instance = null;

    private LazySingleton() {

    }


    public static LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;


    }


}
