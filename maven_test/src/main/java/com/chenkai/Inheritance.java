package com.chenkai;

public class Inheritance {
    public static void main(String[] args) {
        B b=new B();//调用子类的构造方法，会先调用父类的构造方法
        b.showB();
    }
}
class A{

    public int age;

    public A() {
        System.out.println("这是A中的构造方法。");
    }

    public void showA() {
        System.out.println("A中的showA方法。");
    }

    public void showB() {
        System.out.println("A中的showB方法");
    }
}

/*
 * super:父类对象的引用，
 * 作用：
 * 1.调用父类的构造方法
 * 2.当子类与父类方法重名时，用于区分，方法名前添加super，表示调用父类中的方法
 * */

//一个类只能继承一个父类
 class B extends A{
    public B() {
        super();
        //super();//调用父类的无参的构造方法，当父类构造方法为无参的方法时，此语句可以省略。当父类构造方法为有参的方法时，此语句不可以省略
        //通过super关键字调用父类的构造方法，此语句必须是语句块中的第一条语句

        //	super();
        System.out.println("这是B中的构造方法。");
    }

    public void showB() {
        //子类继承父类：可以直接调用父类中提供的非private修饰的属性和方法。
        showA();
        System.out.println("这是B中的showB方法。");
        super.showB();
    }
}
