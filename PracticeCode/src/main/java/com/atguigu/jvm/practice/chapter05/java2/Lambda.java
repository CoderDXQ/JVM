package com.atguigu.jvm.practice.chapter05.java2;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:39 下午
 */

interface Func {
    public boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        Func func = s -> {
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}
