package com.atguigu.jvm.practice.chapter17.java;

import java.util.ArrayList;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:47 下午
 */
public class GCLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100];//100KB
            list.add(arr);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
