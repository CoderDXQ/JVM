package com.atguigu.jvm.practice.chapter05.java3;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:40 下午
 */
public class StringBuilderTest {

    int num = 10;

    //s1的声明方式是线程安全的
    public static void method1() {
        //StringBuilder:线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
    }

    //sBuilder的操作过程：是线程不安全的
    public static void method2(StringBuilder sBuilder) {
        sBuilder.append("a");
        sBuilder.append("b");
    }

    //s1的操作：是线程不安全的
    public static StringBuilder method3() {
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }

    //s1的操作：是线程安全的
    public static String method4() {
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }


    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        new Thread(() -> {
            s.append("a");
            s.append("b");
        }).start();

        method2(s);
    }


}
