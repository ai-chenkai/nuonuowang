package com.chenkai.thread;

//面试题：doother方法执行的时候需要等待dosome方法执行结束吗？
//答案：不需要，因为doother没有synchronized

public class threadsafeTest01 {
    public static void main(String[] args) {
        Myclass mc=new Myclass();
        Thread x=new mythread(mc);
        Thread y=new mythread(mc);
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
class mythread extends Thread{
    private Myclass mc;
    public mythread(Myclass mc){
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
class Myclass{
    public synchronized void dosome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome over");
    }
    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
