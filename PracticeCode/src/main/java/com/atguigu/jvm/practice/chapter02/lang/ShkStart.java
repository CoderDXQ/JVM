package com.atguigu.jvm.practice.chapter02.lang;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/8 12:26 上午
 */
public class ShkStart {//下面的String要用原来JDK里的
    public static void main(java.lang.String[] args) {//因为lang与jdk的lang重名 所以无法进行加载
        System.out.println("hello!");
    }
}
