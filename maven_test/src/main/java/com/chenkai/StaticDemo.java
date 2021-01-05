package com.chenkai;
/*
	static：用来修饰类的成员（属性和方法）
	1.修饰变量称为类变量或者静态变量，修饰方法称为类方法或者静态方法
	2.当类被加载的时候就会被加载，优先于对象的存在
	3.用来修饰语句块称为静态代码块。先于构造方法之前执行，只会执行一次，用来对静态成员做初始化
	4.静态修饰的成员被所有的对象共享
	5.调用的时候可以直接通过   类名.成员   来进行访问，用  对象.成员当然也可以访问，不推荐使用

	注意事项：
	1.静态方法中只能访问外部的静态成员
	2.静态方法中不能出现this关键字
	原因：静态方法优先于对象的存在，加载静态成员时还没有对象，所以不能访问外部的其他非
	静态成员，this表示当前对象的引用，对象都没有，所以不能使用this。
*/
public class StaticDemo {
    public static void main(String[] args) {
        Static s=new Static();
        s.number1++;//每个对象都有一份自己的独立属性
/*      s.showNumber1();
        s.showNumber2();*/
        //静态变量的访问，可以直接用  类名.属性  来访问,对象.属性  也可以访问，不推荐使用
        System.out.println(Static.number1);
        System.out.println();
        Static s1=new Static();
        /*s1.showNumber1();*/
        s1.showNumber2();//验证：非静态的方法，可以引用静态成员或者其他非静态的属性和方法
    }
}
class Static{

    public static int number1=1;//静态变量不属于任何对象，它称为类变量，属于类所有，调用时用 类名.属性
    public int number2=1;

    public static void showNumber1(){
        System.out.println("number1="+number1);
        /* 静态方法中只能访问静态成员，不能访问非静态变量或者非静态方法，也不能使用this关键字(当前对象的引用)
       eg：不能使用

		   //System.out.println("number2="+number2);//number2非静态变量
		   //showNumber2();//非静态方法不能在静态方法中使用

		   原因：静态方法优先于对象的存在，加载静态成员时还没有对象，所以不能访问外部的其他非
		   静态成员，内部也不能出现this关键字，this表示当前对象的引用，对象都没有，所以不能使用this。
		*/
    }

    public void showNumber2(){//非静态的方法，可以引用静态成员或者其他非静态的属性和方法
        System.out.println("number2="+number2);

        showNumber1();
    }
}
