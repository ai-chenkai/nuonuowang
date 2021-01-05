package com.chenkai;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Do_g dog=new Do_g();//dog是Dog类下的一个实例
        dog.name="旺财";
        dog.age=5;
        dog.bread="中华田园犬";

        dog.eat();
        dog.getMessage();
    }

}

//编码规范：一个文件中只定义一个类
class Do_g{

    //类是抽象出来的定义，将对象共有的属性以及方法抽取出来，放入模块或蓝图中，称为类
    //对象是具体的事物，类是对象抽象出来的概念

    //类的成员:属性
    public String name;
    public int age;
    public String bread;

    //类的成员：方法method（函数）
    public void eat() {
        System.out.println("这是一条"+bread+"，名字叫做"+name+"，今年"+age+"岁了，爱啃骨头。");
    }

    public void getMessage() {
        System.out.println("这是一条"+bread+"，名字叫做"+name+"，今年"+age+"岁了。");
    }
}
