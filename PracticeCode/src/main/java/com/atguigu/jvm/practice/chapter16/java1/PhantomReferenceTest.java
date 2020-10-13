package com.atguigu.jvm.practice.chapter16.java1;

import java.lang.ref.ReferenceQueue;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:45 下午
 */
public class PhantomReferenceTest {
    public static PhantomReferenceTest obj;//当前类对象的声明
    static ReferenceQueue<PhantomReferenceTest> phantomQueue=null;//引用队列

    public static class CheckRefQueue extends Thread{




    }

    @Override
    protected void finalize() throws Throwable{


    }

    public static void main(String[] args) {

    }



}
