package com.atguigu.jvm.practice.chapter02.java;

import com.sun.org.apache.xpath.internal.objects.XNumber;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:03 下午
 */
public class ClassInitTest {//初始化阶段就是执行类构造器方法<clinit>()的过程 构造器方法中按语句在源文件中出现的顺序执行
    private static int num = 1;//显式初始化

    static {//静态代码块初始化
        num=2;
        number=20;//可以在这里赋值但是不能在这里调用
        System.out.println(num);
//        System.out.println(number);//报错：非法的前向引用 20行的语句写在本句之前就不会报这个错误 也就是说 一个变量在使用之前必须在上文定义
    }

    private static int number=10;

    public static void main(String[] args) { //虚拟机把定义变量时的显式初始化和静态代码块的初始化放在一起 所以num先初始化为1后初始化为2（两次初始化不同） 而number在静态代码块初始化时是20（此时还没有定义这个变量） 在后来进行显式初始化时变为10
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }



}
