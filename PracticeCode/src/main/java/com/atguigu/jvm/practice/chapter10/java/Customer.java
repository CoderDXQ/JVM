package com.atguigu.jvm.practice.chapter10.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:20 下午
 */
public class Customer {
    int id = 1001;
    String name;
    Account acct;

    {
        name = "匿名用户";
    }
}

class Account {

}
