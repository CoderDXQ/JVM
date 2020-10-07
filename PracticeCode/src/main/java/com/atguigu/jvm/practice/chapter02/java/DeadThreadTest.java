package com.atguigu.jvm.practice.chapter02.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:11 下午
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            //lambda表达式 定义线程要执行的方法的内容
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "开始");
        };
        Thread t1 = new Thread(r, "线程1");
        //传入线程要执行的接口
        Thread t2 = new Thread(r, "线程2");
        t1.start();
        t2.start();
    }
}



class DeadThread {
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while (true) {//类似于一个同步加锁的过程

            }
        }
    }
}

