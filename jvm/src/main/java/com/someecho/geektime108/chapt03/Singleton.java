package com.someecho.geektime108.chapt03;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-04
 */
public class Singleton {
    private Singleton() {}
    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}