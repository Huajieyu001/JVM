package com.example.module1.p11;

public class InitDemo1 {


    private static int value = 1;

    static {
        value = 2;
    }

    public static void main(String[] args) {
        System.out.println(value);
        System.out.println(InitLitDemo.i);
    }

}


class InitLitDemo {
    static {
        System.out.println("InitLitDemo init...");
    }
    // static final修饰的变量被调用不会触发类的初始化
    public static final int i = 0;
 }