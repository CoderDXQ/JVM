package com.atguigu.jvm.practice.chapter08.java1;


import java.util.TreeMap;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:07 下午
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
