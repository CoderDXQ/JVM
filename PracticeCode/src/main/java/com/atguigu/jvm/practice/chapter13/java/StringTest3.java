package com.atguigu.jvm.practice.chapter13.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:30 下午
 */
public class StringTest3 {
    public static void main(String[] args) {
        //使用Set保持着常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<>();
        //在short可以取值的范围内足以让6MB的PermSize或heap产生OOM
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
