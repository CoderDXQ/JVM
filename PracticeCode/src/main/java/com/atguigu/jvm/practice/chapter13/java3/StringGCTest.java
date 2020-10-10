package com.atguigu.jvm.practice.chapter13.java3;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:33 下午
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int j = 0; j < 100000; j++) {
            String.valueOf(j).intern();
        }
    }
}
