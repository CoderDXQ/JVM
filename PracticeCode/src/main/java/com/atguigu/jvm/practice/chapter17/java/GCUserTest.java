package com.atguigu.jvm.practice.chapter17.java;

import java.util.ArrayList;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:48 下午
 */
public class GCUserTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while (true) {
            byte[] arr = new byte[100];
            list.add(arr);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
