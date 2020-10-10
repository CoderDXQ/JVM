package com.atguigu.jvm.practice.chapter13.java;

import java.io.FileWriter;
import java.io.IOException;


/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:29 下午
 */
public class GenerateString {
    public static void main(String[] args) throws IOException {
        //读写文件必须要有返回 可以返回异常
        FileWriter fw = new FileWriter("words.txt");

        for (int i = 0; i < 100000; i++) {
            int length = (int) (Math.random() * (10 - 1 + 1) + 1);
            fw.write(getString(length) + "\n");
        }
        fw.close();
    }

    public static String getString(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            int num = (int) (Math.random() * (90 - 65 + 1) + 65) + (int) (Math.random() * 2) * 32;
            str += (char) num;
        }
        return str;
    }
}
