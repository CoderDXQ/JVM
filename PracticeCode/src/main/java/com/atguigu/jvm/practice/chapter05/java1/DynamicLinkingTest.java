package com.atguigu.jvm.practice.chapter05.java1;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:27 下午
 */
public class DynamicLinkingTest {
    int num = 10;

    public void methodA() {
        System.out.println("methodA()...");
    }

    public void methodB() {
        System.out.println("methodB()...");
        methodA();
        num++;
    }
}
