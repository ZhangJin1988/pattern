package com.zhangjin.prototype;

import java.io.*;

/**
 * Created by zhangjin on 2018/4/21.
 */
public class Prototype implements Cloneable, Serializable {


    private User user;

    private String name;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "user=" + user +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    protected Prototype deepClone() throws IOException, ClassNotFoundException {

        Prototype copy = null;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        copy = (Prototype) objectInputStream.readObject();

        return copy;
    }
}
