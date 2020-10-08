package com.atguigu.jvm.practice.chapter06.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:42 下午
 */
public class IHaveNatives {

    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;

}
