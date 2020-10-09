package com.atguigu.jvm.practice.chapter09.java1;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:17 下午
 */
public class StaticFieldTest {
    private static byte[] arr = new byte[1024 * 1024 * 100];//100MB

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
