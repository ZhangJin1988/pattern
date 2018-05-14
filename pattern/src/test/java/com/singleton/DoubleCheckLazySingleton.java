package com.singleton;

public class DoubleCheckLazySingleton {


    private static DoubleCheckLazySingleton instance;


    public static DoubleCheckLazySingleton getInstance() {


        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;

    }
}
