package com.someecho.bytecode;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-02-27
 */
public class Hello {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = a + b;
        int difference = a - b;
        if (sum > difference) {
            System.out.println(" sum is greater than difference");
        } else {
            System.out.println("difference is greater than or equal to sum");
        }
    }
}
