package com.atguigu.jvm.practice.chapter08.java1;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:06 下午
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
