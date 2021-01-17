package com.chenkai.thread;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

//推荐使用这种方式终止线程，创建一个布尔类型的flag
public class threadTest04 {
    public static void main(String[] args) {
        mythread04 m=new mythread04();
        Thread n=new Thread(m);
        n.start();
        try {
            n.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.run= false;//5秒之后终止线程
    }
}
class mythread04 implements Runnable{
    boolean run=true;
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(run){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                return;  //终止当前线程
            }
        }
    }
}