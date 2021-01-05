package com.chenkai;

public class test {
    public static void main(String[] args) {
        Jiekou1 man=new man("胡歌");
        Jiekou2 women=new women("杨幂");
        Human human=new Human();
        human.yundong(man);
        human.yd(women);
    }
}
interface Jiekou1{
    void run();
}
interface  Jiekou2{
    void walk();
}

class man implements Jiekou1{
    private String name;
    public man(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void run(){
        System.out.println(getName()+"在跑步");
    }
}
class women implements  Jiekou2{
    private String name;
    public women(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void walk(){
        System.out.println(getName()+"在走路");
    }
}
class Human {
    public void yundong(Jiekou1 abc){
        abc.run();
    }
    public void yd(Jiekou2 qwe){
        qwe.walk();
    }
}