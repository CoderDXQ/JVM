package com.atguigu.jvm.practice.chapter08.java2;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:11 下午
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}
