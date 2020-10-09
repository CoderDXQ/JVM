package com.atguigu.jvm.practice.chapter11.java;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:23 下午
 */
public class MaxDirectMemorySizeTest {
    private static final int _1MB = 1024 * 1024;//1MB

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredField()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
