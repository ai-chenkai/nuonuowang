package com.chenkai;

public class FinalDemo {
    public static void main(String[] args) {
        X x=new X();
        x.showNum1();
        B b=new B();//调用子类的构造方法，会先调用父类的构造方法
        b.showB();

    }
}
/*
 * final表示常量
 * 修饰变量时，将变量定义为常量，不能重新赋值
 * 修饰方法时，表示方法不能被重写
 * 修饰类时，表示类不能被继承
 * */

/*final*/
class X{
    public final int num1=10;
    public int num2=20;

    //修饰方法时，方法不能被重写
    public /*final*/ void showNum1() {
        num2++;
//        num1++;
        System.out.println(num1);

    }
}

class Y extends X{
    //override
    public void showNum1() {
        num2++;
        System.out.println(num2);
    }
}