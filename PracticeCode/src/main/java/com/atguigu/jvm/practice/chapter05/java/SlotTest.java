package com.atguigu.jvm.practice.chapter05.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:25 下午
 */
public class SlotTest {
    public void localVar1() {
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        int a = 0;
        System.out.println(a);
    }

    //此时b就会复用a的槽位
    int b = 0;
}
