package com.chenkai.thread;

import java.util.ArrayList;
import java.util.List;
//实现生产者消费者模式，线程均衡
public class threadTest05 {
    public static void main(String[] args) {
        //创建一个仓库对象，共享的
        List mylist=new ArrayList();
        Thread t1=new Thread(new producer(mylist));
        Thread t2=new Thread(new consumer(mylist));
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();


    }
}
//生产者线程
class producer implements Runnable{
    private List list;
    public producer(List list){
        this.list=list;
    }

    @Override
    public void run() {
        //一直生产
        while(true){
            //给仓库对象list加锁
            synchronized (list){
                if(list.size()>0){   //大于0，说明仓库已经有1个元素了
                    try {
                        //当前线程进入等待状态，并且释放producer之前占有的list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这说明仓库是空的，可以生产
                Object obj=new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"--->"+obj);
                //唤醒消费者进行消费
                list.notifyAll();
            }
        }
    }
}

//消费者线程
class consumer implements Runnable{
    private List list;
    public consumer(List list){
        this.list=list;
    }

    @Override
    public void run() {
        //一直消费
        while(true){
            //给仓库对象list加锁
            synchronized (list){
                if(list.size()==0){   //大于0，说明仓库已经有1个元素了
                    try {
                        //当前线程进入等待状态，并且释放producer之前占有的list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这说明仓库不是空的，可以消费
                Object obj=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"--->"+obj);
                //唤醒生产者进行生产
                list.notifyAll();
            }
        }
    }
}