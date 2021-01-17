package com.chenkai.thread;

//面试题：doother方法执行的时候需要等待dosome方法执行结束吗？
//答案：不需要，因为myclass03对象是两个，两把锁

public class threadsafeTest03{
    public static void main(String[] args) {
        Myclass03 mc01=new Myclass03();
        Myclass03 mc02=new Myclass03();
        Thread x=new mythread09(mc01);
        Thread y=new mythread09(mc02);
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

class mythread09 extends Thread{
    private Myclass03 mc;
    public mythread09(Myclass03 mc){
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

class Myclass03{
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
