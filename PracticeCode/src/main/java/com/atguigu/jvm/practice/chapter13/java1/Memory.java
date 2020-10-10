package com.atguigu.jvm.practice.chapter13.java1;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:30 下午
 */
public class Memory {
    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        Memory mem = new Memory();
        mem.foo(obj);
    }

    private void foo(Object param) {
        String str = param.toString();
        System.out.println(str);
    }
}
