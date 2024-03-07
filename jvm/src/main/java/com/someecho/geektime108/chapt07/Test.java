package com.someecho.geektime108.chapt07;

import java.lang.reflect.Method;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-04
 */
public class Test {
    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("Test");
        Method method = klass.getMethod("target", int.class);
        method.invoke(null, 0);
    }
}