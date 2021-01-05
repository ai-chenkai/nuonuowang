package com.chenkai;

public class Encapsulation {
    public static void main(String[] args) {
        Student student=new Student();
	/*	student.name="张思思";
		student.age=18;*/
        student.setAge(180);
        student.setName("张思思");
        System.out.println(student.getMessage());
    }
}
/*隐藏信息，实现细节。
防止用户意外修改数据
对模块的内部结构可以自由修改，不会影响使用该模块的代码,减少类与类之间的耦合关系，使模块易于使用和维护
可以对成员变量进行更精确的控制
*/

class Student{

    /*public String name;
    public String age;*/
    private String name;
    private String age;

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age=String.valueOf(age);
        //	this.age=age;
    }
    //编码规范：开闭原则：对扩展是开放的，对扩展的同时需要修改其他类、其他代码是关闭的。
    public String getMessage() {
        return name+"同学今年"+age+"岁了。";
    }
}