package com.example.chapter.p53;

import java.util.ArrayList;
import java.util.List;

// VM -XX:HeapDumpPath=G:\env\16jvm\testFullGC.hprof -XX:+HeapDumpBeforeFullGC
public class TestFull {

    public static void main(String[] args) {

        TestClass a1 = new TestClass();
        TestClass a2 = new TestClass();
        TestClass a3 = new TestClass();

        String s1 = "HELLO world1";
        String s2 = "HELLO world2";
        String s3 = "HELLO world3";

        a1.list.add(s1);

        a2.list.add(s1);
        a2.list.add(s2);

        a3.list.add(s3);

        s1 = null;
        s2 = null;
        s3 = null;
        System.gc();
    }
}

class TestClass {
    List<String> list = new ArrayList<>();
}
