package com.atguigu.jvm.practice.chapter02.java1;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:16 下午
 */
public class StringTest {
    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();
        System.out.println("hello,atguigu.com");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }
}
