package com.atguigu.jvm.practice.chapter13.java2;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:31 下午
 */
public class StringExer2 {
    public static void main(String[] args) {
        String s1 = new String("ab");//执行完以后，会在字符串常量池中会生成"ab"
        String s3 = new String("a") + new String("b");//执行完以后，不会在字符串常量池中会生成"ab"

        s1.intern();
        s3.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);//false 不是同一个地址
        System.out.println(s2 == s3);//false
    }
}
