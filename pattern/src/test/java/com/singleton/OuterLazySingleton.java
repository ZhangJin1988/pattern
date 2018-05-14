package com.singleton;

public class OuterLazySingleton {

    private static boolean isInit = false;

    private OuterLazySingleton() {

        synchronized (OuterLazySingleton.class) {

            if (!isInit) {
                isInit = true;
            } else {
                throw new RuntimeException("单例已经被破坏了");
            }
        }


    }

    static class InnerClass {
        private static OuterLazySingleton instance = new OuterLazySingleton();
    }

    public static OuterLazySingleton getInstance() {
        return InnerClass.instance;
    }
}
