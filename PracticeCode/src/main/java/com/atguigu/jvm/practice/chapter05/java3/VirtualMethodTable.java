package com.atguigu.jvm.practice.chapter05.java3;


/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:41 下午
 */

interface Friendly {
    void sayHello();

    void SayGoodbye();
}

class Dog {
    public void sayHello() {
    }

    public String toString() {
        return "Dog";
    }
}

class Cat implements Friendly {
    public void eat() {
    }

    public void sayHello() {
    }

    public void sayGoodbye() {
    }

    public void finalize() {
    }

    public String toString() {
        return "Cat";
    }


}

class CockerSpaniel extends Dog implements Friendly {
    public void sayHello() {
        super.sayHello();
    }

    public void sayGoodbye() {
    }
}

public class VirtualMethodTable {
}
