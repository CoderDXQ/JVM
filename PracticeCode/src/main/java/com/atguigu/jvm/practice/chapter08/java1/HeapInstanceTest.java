package com.atguigu.jvm.practice.chapter08.java1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:07 下午
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();//这里有没有~ 有了是什么用法 区别
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
