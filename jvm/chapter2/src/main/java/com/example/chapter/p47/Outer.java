package com.example.chapter.p47;

import java.util.ArrayList;
import java.util.List;

public class Outer {

    private String name;

    private byte [] bytes = new byte[1024 * 1024 * 100];

    public static void main(String[] args) {
        List<Inner> list = new ArrayList<>();
        int count = 0;

        while(true){
            if(count % 100 ==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            list.add(new Outer().new Inner());
        }
    }

    public class Inner{
        private String name;

        public Inner(){
            this.name = new Outer().name;
        }
    }
}
