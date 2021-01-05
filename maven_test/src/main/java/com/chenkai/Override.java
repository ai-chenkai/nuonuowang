package com.chenkai;

public class Override {
    public static void main(String[] args) {
        JavaTeacher jt=new JavaTeacher("陈老师","中国计量大学");
        LinuxTeacher lt=new LinuxTeacher("韦老师","中国计量大学");
        jt.teach();
        lt.teach();
    }
}
//父类中定义的成员是子类共有的属性和方法，尽量少写private修饰的特殊的成员，父类需要更加抽象，子类更具体
class Teacher{

    public String name;
    public String school;

    public Teacher(String name,String school) {
        this.name=name;
        this.school=school;
    }

    public void getMessage() {
        System.out.print(school+"的"+name);
    }

    public void teach() {
        System.out.print("课前一番准备之后，");
    }
}

class JavaTeacher extends Teacher{
    public JavaTeacher(String name,String school) {
        super(name, school);//当父类的构造方法为有参的构造方法时，子类的构造方法必须在第一条语句中调用父类的有参的构造方法
    }

    //继承核心思想：基于已存在的类，构建新的类，实现新的功能
    public void teach() {
        getMessage();
        super.teach();
        //子类更具体，可以有一些特殊的方法
        System.out.println("开打eclipse，开始编写java源代码。");
    }
}


class LinuxTeacher extends Teacher{

    public LinuxTeacher(String name,String school) {
        super(name, school);//当父类的构造方法为有参的构造方法时，子类的构造方法必须在第一条语句中调用父类的有参的构造方法
    }

    //override重写:在不同类中，访问修饰符相同（不允许降低方法的访问权限），方法的签名相同，方法体不同
    public void teach() {
        getMessage();
        super.teach();
        //子类更具体，可以有一些特殊的方法
        System.out.println("开打xshell，开始运行linux命令，对linux系统进行操作。");
    }
}