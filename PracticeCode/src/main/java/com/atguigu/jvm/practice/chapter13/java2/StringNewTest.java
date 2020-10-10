package com.atguigu.jvm.practice.chapter13.java2;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:33 下午
 */
public class StringNewTest {
    public static void main(String[] args) {
        //   String str=new String("ab");//会在常量池中注册

        String str = new String("a") + new String("b");//不会在常量池中注册
    }
}
