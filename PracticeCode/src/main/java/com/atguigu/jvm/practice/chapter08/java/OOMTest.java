package com.atguigu.jvm.practice.chapter08.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:05 下午
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
