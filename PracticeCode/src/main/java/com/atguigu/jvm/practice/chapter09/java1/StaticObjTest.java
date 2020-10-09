package com.atguigu.jvm.practice.chapter09.java1;


/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:18 下午
 */
public class StaticObjTest {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder {

    }

    public static void main(String[] args) {
        Test test = new StaticObjTest.Test();
        test.foo();
    }
}
