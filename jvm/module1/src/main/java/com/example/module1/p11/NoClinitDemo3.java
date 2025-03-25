package com.example.module1.p11;

/**
 * 2.有静态变量的声明但是没有赋值，也不会生成clinit
 */
public class NoClinitDemo2 {

    private static int value;

    NoClinitDemo2(){
        System.out.println("构造函数");
    }

    public static void main(String[] args) {

    }
}
