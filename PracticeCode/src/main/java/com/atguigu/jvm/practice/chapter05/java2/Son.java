package com.atguigu.jvm.practice.chapter05.java2;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:39 下午
 */

class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 的普通方法");
    }

}

public class Son extends Father {
    public Son() {
        //invokespecial
        super();
    }

    public Son(int age) {
        //invokespecial
        this();
    }

    //不是重写的父类的静态方法，因为静态方法不能被重写
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private " + str);
    }

    public void show() {
        //invokestatic
        showStatic("atguigu.com");

        //invokestatic
        super.showStatic("good!");

        //invokespecial
        showPrivate("hello!");

        //invokespecial
        super.showCommon();


        //invokevirtual
        showFinal();//因为此方法声明有final,不能被子类重写，所以也认为此方法是非虚方法
        //虚方法如下：
        //invokevirtual
        showCommon();
        info();

        MethodInterface in = null;
        //invokeinterface
        in.methodA();

    }

    public void info() {

    }

    public void display(Father f) {
        f.showCommon();
    }

    public static void main(String[] args) {
        Son so = new Son();
        so.show();
    }

}

interface MethodInterface {
    void methodA();
}
