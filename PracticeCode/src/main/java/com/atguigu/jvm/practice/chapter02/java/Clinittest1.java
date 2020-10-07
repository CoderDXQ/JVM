package com.atguigu.jvm.practice.chapter02.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:03 下午
 */
public class Clinittest1 {
    static class Father{
        public static int A=1;
        static {
            A=2;
        }
    }
    static class Son extends Father{
        public static int B=A;
    }

    public static void main(String[] args) {
        //先加载Father类，然后加载Son类
        System.out.println(Son.B);//2
    }









}
