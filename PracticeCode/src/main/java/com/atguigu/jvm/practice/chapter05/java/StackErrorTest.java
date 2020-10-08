package com.atguigu.jvm.practice.chapter05.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:26 下午
 */
public class StackErrorTest {
    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
