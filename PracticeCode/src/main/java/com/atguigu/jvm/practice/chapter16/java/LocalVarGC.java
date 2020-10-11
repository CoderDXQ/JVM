package com.atguigu.jvm.practice.chapter16.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:44 下午
 */
public class LocalVarGC {
    public void localvarGC1(){
        byte[] buffer=new byte[10*1024*1024];//10MB
        System.gc();
    }

    public void localvarGC2(){
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();

    }

    public 
}
