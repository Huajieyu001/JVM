package com.example.module1.p37;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class P37GcDemo {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        int count = 0;
        while(true){

            try {
                System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(++count);
            list.add(new byte[1021*1024]);
        }
    }
}
