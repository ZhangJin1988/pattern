package com.zhangjin.prototype;

import java.io.IOException;

/**
 * Created by zhangjin on 2018/4/21.
 */
public class Test {

    //浅copy测试
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {


        User user = new User();
        user.setAge(11);
        user.setName("zhangjin");
        Object clone = user.clone();
        System.out.println(user);
        System.out.println(clone);
        System.out.println(user==clone);



        Prototype prototype = new Prototype();
        prototype.setUser(user);
        prototype.setName("测试");

        Prototype clone1 =(Prototype) prototype.clone();
        System.out.println(prototype==clone1);
        System.out.println(prototype.getUser()==clone1.getUser());

        //深度copy
        Prototype prototype1 = prototype.deepClone();
        System.out.println(prototype.getUser() == prototype1.getUser());


    }
}
