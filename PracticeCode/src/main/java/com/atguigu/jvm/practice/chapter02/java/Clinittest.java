package com.atguigu.jvm.practice.chapter02.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:03 下午
 */
public class Clinittest {//如果没有调用类或者静态代码块的赋值就不会执行类的构造器等  类构造器方法<clinit>()是javac编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并而来的
//任何一个类声明以后，至少存在一个类的构造器
    private static int a=1;

    private static int c=3;//静态代码块

    public static void ClinitTest(){
        a=10;
        int d=20;

        System.out.println(d);
    }

    public static void main(String[] args) {
        int b=2;
        Clinittest.ClinitTest();//在一个类的各个方法互相调用不需要进行实例化
    }



}
