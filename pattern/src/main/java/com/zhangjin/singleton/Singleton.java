package com.zhangjin.singleton;

/**
 * Created by zhangjin on 2018/4/21.
 */
public class Singleton {


//    private static Singleton instance;

    private Singleton(){

    }

    public static  Singleton getInstance(){
        return  Instance.Instance;
    }

    private static   class Instance{

       private static final Singleton Instance = new Singleton();





    }
}
