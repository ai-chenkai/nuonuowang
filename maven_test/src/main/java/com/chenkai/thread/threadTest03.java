package com.chenkai.thread;

//中断正在睡眠的线程
public class threadTest03 {
    public static void main(String[] args) {
        Thread my=new Thread(new mythread03());
        my.setName("t1");
        my.start();
        try {
            //希望5秒之后t1线程醒来
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断睡眠
        my.interrupt();


    }
}
class mythread03 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--> begin");
        try {
            //睡一年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--> over");
    }
}