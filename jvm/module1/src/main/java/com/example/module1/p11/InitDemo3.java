package com.example.module1.p11;

public class InitDemo2 {


    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.example.module1.p11.InitLitDemo2");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}


class InitLitDemo2 {
    static {
        System.out.println("InitLitDemo2 init...");
    }
 }