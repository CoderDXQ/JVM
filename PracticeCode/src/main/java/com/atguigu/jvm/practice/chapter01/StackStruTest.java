package com.atguigu.jvm.practice.chapter01;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 1:48 下午
 */
public class StackStruTest {
    public static void main(String[] args) {
        int i=2;
        int j=3;
        int k=i+j;

        try {//线程停顿6000毫秒
            Thread.sleep(6000);
           // Thread.sleep(6);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}
