package com.chenkai;
/*
 * 接口特点：
 * 接口中只能定义公有的静态常量和抽象方法
 * Java接口是对功能的扩展，把特有的功能放入接口中
 * 通过实现接口，java类可以实现多实现(可以实现多个接口)
 * 一个类可以同时继承(extends)一个父类并且实现(implements)多个接口
 * 接口与接口之间可以通过使用extends来产生继承关系
 *
 * 接口与抽象类的区别：
 * 抽象类和具体实现类之间是一种继承关系，也就是说如果采用抽象类的方式，则父类和子类在概念上应该是相同的
 * 接口和实现类在概念上不要求相同，接口只是抽取相互之间没有关系的类的共同特征而不去关注类之间的关系，它可以使没有层次关系的类具有相同的行为。
 * 抽象类是对一组具有相同属性和行为的逻辑上有关系的事物的一种抽象，而接口则是对一组具有相同属性和行为的逻辑上不相关的事物的一种抽象
 * 对于接口和抽象类的选择，反映出设计人员看待问题的不同角度。抽象类用于一组相关的事物，表示的是"is-a"的关系；
 * 而接口用于一组不相关的事物，表示的是"like-a"的关系。
 *
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        //Ifunction.num=100;
        //System.out.println(Ifunction.num);
        //Ifunction.num2++;
        //Ifunction.methodOne();

		/*Monkey monkey=new Monkey("大师兄");
		Child child=new Child("铁蛋");
		Person person=new Person();
		person.feed(child);
		person.feed(monkey);*/
        Iability1 monkey=new Monkey("大师兄");
        Iability1 child=new Child("铁蛋");
        Iability1 tiger=new Tiger("大虫");
        Person person=new Person();
        person.feed(monkey);
        person.feed(child);
        person.feed(tiger);
    }
}
/*interface Ifunction{
	public static final int num=10;
	public final static int num1=20;//顺序可以改变，不推荐
	int num2=30;//可以省略public static final ，但是会默认添加

	public abstract void method();

	//public void methodOne() {} 接口中不允许有具体实现的方法，只能是抽象方法

	void methodOne();//省略public abstract ，让然仍为methodOne是抽象方法
}*/

interface Iability1{
    void eat();
}

interface Iability2{
    void sleep();
}

class Monkey implements Iability1{

    private String name;

    public Monkey(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    //实现类需要重写接口中提供的方法，不能放任不管
    public void eat() {
        System.out.println(getName()+"爱吃桃。");
    }

}

class Tiger implements Iability1{

    private String name;

    public Tiger(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    //实现类需要重写接口中提供的方法，不能放任不管
    public void eat() {
        System.out.println(getName()+"爱吃肉。");
    }

}

//接口抽取的是没有关联关系的类的共同特征
//一个类只能继承一个父类，但是可以实现多个接口
class Child implements Iability1,Iability2{
    private String name;

    public Child(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void eat() {
        System.out.println(getName()+"爱喝奶。");
    }

    public void sleep() {
        System.out.println(getName()+"爱睡觉。");
    }
}

class Person{
	/*public void feed(Monkey monkey) {
		monkey.eat();
	}

	//overload
	public void feed(Child child) {
		child.eat();
	}*/
    //接口实现了多态，接口的引用变量可以指向其实现类的对象
    //传参，越抽象越稳定
    public void feed(Iability1 ability) {
        ability.eat();
    }
}