package com.atguigu.jvm.practice.chapter09.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:14 下午
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }

}

class Order {
    public static int count = 1;
    public static final int number = 2;

    public static void hello() {
        System.out.println("hello!");
    }
}
