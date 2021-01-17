package com.chenkai.thread;
//通过实现接口来实现分支线程
//一个线程一个栈，start方法开辟了一个新的分栈
public class threadTest01 {
    public static void main(String[] args) {
        Thread ct=Thread.currentThread();       //获取当前线程对象
        System.out.println(ct.getName());
        myThread my=new myThread();
        Thread t1=new Thread(my);
        System.out.println(t1.getName());       //获取线程名字
        t1.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程--> "+i);
        }
    }
}
class myThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("分支线程-->"+i);
        }
    }
}