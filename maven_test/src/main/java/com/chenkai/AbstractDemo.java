package com.chenkai;
/*
 * 抽象类、抽象方法的应用：
 * 抽象的定义：抽象是把多个事物的共性的内容抽取出来，本质就是把我们关注的内容抽取出来。(比如：宝马、奔驰都属于汽车，汽车是抽象出来的概念)
 * 抽象类：Java中可以定义没有方法体的方法，该方法由其子类来具体的实现。没有方法体的方法我们称为抽象方法，含有抽象方法的类我们称之为抽象类。
 * 抽象方法特点：
 * 		只有方法头没有方法体的方法称为抽象方法
 * 		抽象方法用abstract来修饰
 * 		抽象方法代表一种不确定的操作或行为
 * 		抽象方法不能被调用
 * 抽象类的特点：
 * 		含有抽象方法的类我们称之为抽象类。
 * 		抽象类用abstract来修饰
 * 		抽象类代表一种抽象的对象类型
 * 		抽象类无法实例化
 * 		抽象类中可以有具体方法，可以没有抽象方法
 *
 * 编码中请少用抽象类。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        //Employee employee=new Employee("韦老师",111,3000);抽象类不能被实例化
        Employee mt=new MysqlTeacher("韦老师",111,3000);
        Employee leader=new Leader("陈老师",1,30000,50000);
        mt.working();
        leader.working();
    }
}
//含有抽象方法的类一定是抽象类，必须使用关键字abstract修饰
abstract class Employee{

    public String name;
    public int num;
    public double salary;

    public Employee(String name,int num,double salary) {
        this.name=name;
        this.num=num;
        this.salary=salary;
    }

    //抽象类中可以有具体的实现方法
    public String getMessage() {
        return num+"号员工"+name+"，薪水："+salary;
    }

    //抽象类中可以没有抽象方法
    public abstract void working();//抽象方法需要使用abstract修饰
}

/*一个类继承了抽象类，它有两种选择
 * 1.实现抽象方法
 * 2.继续抽象下去，子类仍然是抽象类*/
/*abstract class MysqlTeacher  extends Employee{
	public MysqlTeacher(String name,int num,double salary) {
		super(name, num, salary);
	}

	public abstract void working();
}*/
class MysqlTeacher  extends Employee{
    public MysqlTeacher(String name,int num,double salary) {
        super(name, num, salary);
    }

    public void working() {
        //super.working();抽象方法不能被调用
        System.out.println(getMessage()+"，主要工作是上mysql课程。");
    }
}

class Leader  extends Employee{

    private double allowance;//津贴，子类特殊的属性

    public Leader(String name,int num,double salary,double allowance) {
        super(name, num, salary);
        this.allowance=allowance;
    }

    public void working() {
        System.out.println(getMessage()+"，津贴："+allowance+"，主要工作是喝茶、开开会、应酬喝酒。");
    }
}