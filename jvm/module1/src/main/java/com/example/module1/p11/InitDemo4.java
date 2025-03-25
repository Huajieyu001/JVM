package com.example.module1.p11;

public class InitDemo3 {

    public static void main(String[] args) {
        new InitLitDemo3();
    }
}


class InitLitDemo3 {
    static {
        System.out.println("InitLitDemo3 init...");
    }
 }