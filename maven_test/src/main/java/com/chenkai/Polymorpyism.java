package com.chenkai;
/*
 * 多态：polymorphism
 * 多态性是指同一操作，作用于某一类对象，可以有不同的解释，产生不同的执行结果。
 * 多态存在的三个必要条件
 * 		需要存在继承(inheritance)和实现关系
 * 		同样的方法调用而执行不同操作、运行不同代码(方法重写override操作)
 * 		在运行时，父类的引用变量或者接口可以引用其子类的对象
 * 多态的作用
 * 		多态通过分离做什么和怎么做，从另一个角度将接口和实现进行分离
 * 		"多态"则消除了类型之间的耦合关系
 * 		多态的存在提高了程序的扩展性和后期的可维护性
 */
public class Polymorpyism {
    public static void main(String[] args) {
        //	Dog dog=new Dog("旺财");
        Animal animal=new Dog("旺财");//将父类的引用变量指向其子类的对象，消除了类型之间的耦合关系
        animal.eat();

        animal=new Cat("招财猫");
        animal.eat();

        animal=new Lion("辛巴");
        animal.eat();
    }
}
class Animal{

    public String name;

    public Animal(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    //将做什么和怎么做分离开，越抽象越稳定
    public void eat() {

    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    //override:怎么做
    public void eat() {
        System.out.println(getName()+"爱啃骨头。");
    }

}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    //override:怎么做
    public void eat() {
        System.out.println(getName()+"爱吃鱼。");
    }

}

class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    //override:怎么做
    public void eat() {
        System.out.println(getName()+"爱吃肉。");
    }

}
