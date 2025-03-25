package com.example.module1.p11;

/**
 * 无静态变量和静态代码块，不会生成clinit
 */
public class NoClinitDemo1 {

    NoClinitDemo1(){
        System.out.println("构造函数");
    }

    {
        System.out.println("动态代码块");
    }

    public static void main(String[] args) {

    }
}
