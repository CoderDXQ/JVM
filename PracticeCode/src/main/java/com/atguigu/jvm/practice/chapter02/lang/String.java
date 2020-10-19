package com.atguigu.jvm.practice.chapter02.lang;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/8 12:26 上午
 */
public class String {

    static {
        System.out.println("我是自定义的String类的静态代码块");
    }

    //错误：在类java.lang.String中找不到main方法 //下面的String要用原来JDK里的
    public static void main(java.lang.String[] args) {
        String st;//实例化的时候会进入静态代码块 然后输出
        System.out.println("hello，String");
    }
}
