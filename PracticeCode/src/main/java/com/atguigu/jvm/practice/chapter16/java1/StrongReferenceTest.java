package com.atguigu.jvm.practice.chapter16.java1;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:46 下午
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
        StringBuffer str1 = str;

        str = null;
        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(str1);
    }
}

