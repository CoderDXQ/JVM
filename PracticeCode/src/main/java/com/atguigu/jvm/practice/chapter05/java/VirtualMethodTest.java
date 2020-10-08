package com.atguigu.jvm.practice.chapter05.java;


/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:27 下午
 */

class Father {
    public static void print(String str) {
        System.out.println("father " + str);
    }

    private void show(String str) {
        System.out.println("father " + str);
    }
}

class Son extends Father {

}


public class VirtualMethodTest {
    public static void main(String[] args) {
        Son.print("coder");
        //Fatherc fa=new Father();
        // fa.show("coooooder");
    }

}
