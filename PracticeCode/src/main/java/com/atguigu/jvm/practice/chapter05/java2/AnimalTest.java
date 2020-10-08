package com.atguigu.jvm.practice.chapter05.java2;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:39 下午
 */
class Animal {
    public void eat() {
        System.out.println("动物进食");
    }
}

interface Huntable {
    void hunt();
}

class Dog extends Animal implements Huntable {//继承某个类实现某个接口  类和接口是独立的

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void hunt() {
        System.out.println("捕食耗子，多管闲事");
    }
}


//？？？这个类里面的东西都要搞懂
class Cat extends Animal implements Huntable {

    //???????????
    public Cat() {//构造方法
        //对super的调用必须是构造器中的第一个语句
        super();//表现为：早期绑定  执行父类的方法
        //  System.out.println("父类的方法执行完了");
    }

    //??????????? 怎么才能调用这个方法？？？
    public Cat(String name) {

        //对this的调用必须是构造器中的第一个语句
        this();//表现为：早期绑定
        System.out.println("父类的方法执行完了！");
    }

    @Override
    public void eat() { //重写从父类继承的方法
        super.eat();//表现为：早期绑定
        System.out.println("猫吃鱼");
    }

    @Override
    public void hunt() { //重写接口？？？
        System.out.println("捕食耗子，天经地义");
    }

}


public class AnimalTest {
    public void showAnimal(Animal animal) {
        animal.eat();//表现为：晚期绑定
    }

    public void showHunt(Huntable h) {
        h.hunt();//表现为：晚期绑定
    }


    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        Dog dog = new Dog();


        //    new Huntable()


        animalTest.showAnimal(dog);//传入继承父类的子类的实例对象
        animalTest.showHunt(dog);//传入接口的实现类的实例对象

        Cat cat = new Cat();

        animalTest.showAnimal(cat);//传入继承父类的子类的实例对象
        animalTest.showHunt(cat);//传入接口的实现类的实例对象

    }

}


