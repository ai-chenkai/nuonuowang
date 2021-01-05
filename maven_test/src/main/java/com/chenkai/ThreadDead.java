package com.chenkai;

public class ThreadDead {
    public static Object resources01 = new Object();
    public static Object resources02 = new Object();

    public static void main(String[] args) {

        //经销商
        new Thread(new Runnable() {

            public void run() {
                synchronized (resources01) {
                    System.out.println("线程1占用了资源1,开始请求资源2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources02) {
                        System.out.println("线程1占用了资源1且占用了资源2");
                    }
                }
            }
        }).start();

        //客户
        new Thread(new Runnable() {

            public void run() {
                synchronized (resources02) {
                    System.out.println("线程2占用了资源2,开始请求资源1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources01) {
                        System.out.println("线程2占用了资源2且占用了资源1");
                    }
                }
            }
        }).start();
    }
}

