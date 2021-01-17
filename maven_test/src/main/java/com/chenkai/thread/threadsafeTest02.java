package com.chenkai.thread;

//面试题：doother方法执行的时候需要等待dosome方法执行结束吗？
//答案：需要

public class threadsafeTest02 {
    public static void main(String[] args) {
        Myclass02 mc01=new Myclass02();
        Thread x=new mythread08(mc01);
        Thread y=new mythread08(mc01);
        x.setName("t1");
        y.setName("t2");
        x.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        y.start();

    }
}

class mythread08 extends Thread{
    private Myclass02 mc;
    public mythread08(Myclass02 mc){
        this.mc=mc;
    }
    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            mc.dosome();
        }
        if(Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class Myclass02{
    public synchronized void dosome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome over");
    }
    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
