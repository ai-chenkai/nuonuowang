package com.chenkai.thread;

//面试题：doother方法执行的时候需要等待dosome方法执行结束吗？
//答案：需要，因为静态方法是类所，不管创建了几个对象，类所只有一把

public class threadsafeTest04{
    public static void main(String[] args) {
        Myclass04 mc01=new Myclass04();
        Myclass04 mc02=new Myclass04();
        Thread x=new mythread10(mc01);
        Thread y=new mythread10(mc02);
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

class mythread10 extends Thread{
    private Myclass04 mc;
    public mythread10(Myclass04 mc){
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

class Myclass04{
    public synchronized static void dosome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome over");
    }
    public synchronized static void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
