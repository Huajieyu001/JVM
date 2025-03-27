package com.example.module1.p26.p29;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClassLoaderGcDemo {

    public static void main(String[] args) throws Exception {
        test4();
    }

    // 不存在实例对象，类加载器不存在，Class没有被引用
    public static void test1() {
        List<URLClassLoader> list = new ArrayList<>();
        ArrayList<Object> objs = new ArrayList<>();

        while (true) {
            try {
                URLClassLoader loader = new URLClassLoader(new URL[]{
                        new URL("file:G:\\Program\\JAVA_WorkSpace\\project1\\JVM\\jvm\\bootclassloader-test\\target\\classes\\")
                });
                Class<?> clazz = loader.loadClass("com.test.MyString");
                Object o = clazz.newInstance();

                System.gc();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    // 对象有实例，不会被回收
    public static void test2() {
        List<URLClassLoader> list = new ArrayList<>();
        ArrayList<Object> objs = new ArrayList<>();

        while (true) {
            try {
                URLClassLoader loader = new URLClassLoader(new URL[]{
                        new URL("file:G:\\Program\\JAVA_WorkSpace\\project1\\JVM\\jvm\\bootclassloader-test\\target\\classes\\")
                });
                Class<?> clazz = loader.loadClass("com.test.MyString");
                Object o = clazz.newInstance();
                objs.add(o);

                System.gc();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    // Class有引用，不会被回收
    public static void test3() {
        List<URLClassLoader> list = new ArrayList<>();
        ArrayList<Object> objs = new ArrayList<>();
        ArrayList<Class> classes = new ArrayList<>();

        while (true) {
            try {
                URLClassLoader loader = new URLClassLoader(new URL[]{
                        new URL("file:G:\\Program\\JAVA_WorkSpace\\project1\\JVM\\jvm\\bootclassloader-test\\target\\classes\\")
                });
                Class<?> clazz = loader.loadClass("com.test.MyString");
                Object o = clazz.newInstance();
                classes.add(clazz);

                System.gc();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    // 类加载器有引用，不会被回收
    public static void test4() {
        List<URLClassLoader> list = new ArrayList<>();
        ArrayList<Object> objs = new ArrayList<>();
        ArrayList<Class> classes = new ArrayList<>();

        while (true) {
            try {
                URLClassLoader loader = new URLClassLoader(new URL[]{
                        new URL("file:G:\\Program\\JAVA_WorkSpace\\project1\\JVM\\jvm\\bootclassloader-test\\target\\classes\\")
                });
                Class<?> clazz = loader.loadClass("com.test.MyString");
                Object o = clazz.newInstance();
                list.add(loader);

                System.gc();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
