package com.atguigu.jvm.practice.chapter02.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:11 下午
 */


//类的加载过程分为三步，验证verify   准备prepare   解析resolve
public class HelloApp {
    private static int a=1;//prepare:a=0 --->initial:a=1  在准备阶段，为变量a分配内存并设置值是0（默认初始值，零值），在显式初始化阶段初始化为1

    public static void main(String[] args) {
        System.out.println(a);
    }
}
