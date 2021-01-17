package com.chenkai.thread;

//sleep面试题
public class threadTest02 {
    public static void main(String[] args) {
        Thread test=new mythread02();
        test.setName("t");
        test.start();
        try {   //这行代码会让线程进入休眠状态吗？
            test.sleep(5000);           //在执行的时候还是会转换成：Thread.sleep()
                                             //这行代码的作用是：让当前线程进入休眠，也就是main线程进入休眠
                                             //这行代码出现在main方法中，main线程睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }
}
class mythread02 extends  Thread{
    public void run(){
        for (int i = 0; i <500 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }

    }
}