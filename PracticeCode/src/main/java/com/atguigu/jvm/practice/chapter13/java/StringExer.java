package com.atguigu.jvm.practice.chapter13.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:29 下午
 */
public class StringExer {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }
}
