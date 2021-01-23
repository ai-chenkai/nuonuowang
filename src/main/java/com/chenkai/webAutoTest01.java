package com.chenkai;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class webAutoTest01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        ChromeDriver chromdriver=new ChromeDriver();
        //实例化对象出来后设置隐式等待时间，缺点是针对全局的，并不是每个元素都需要等待这么长时间
        chromdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//设置超时时间5s用于元素的定位
        chromdriver.get("http://www.baidu.com");
        chromdriver.manage().window().maximize();//窗口最大化
        Thread.sleep(1000);//硬性等待
        chromdriver.findElement(By.id("kw")).sendKeys("CSDN");
        Thread.sleep(1000);
//        chromdriver.findElement(By.id("su")).click();
        chromdriver.findElement(By.xpath("//input[@id='su']")).click();
        Thread.sleep(1000);
        System.out.println("新窗口打开前的所有句柄"+chromdriver.getWindowHandles());
        chromdriver.findElement(By.xpath("//a[@title='PyCharm']")).click();
        System.out.println("新窗口打开后的所有句柄"+chromdriver.getWindowHandles());
        chromdriver.navigate();//获取navigation的API，用于网页的刷新，跳转，回退操作，有back，refresh，to，forward（前进）方法
        chromdriver.switchTo().alert();//找到对应的弹出警告框,调用alert的API方法
        //chromdriver.switchTo().frame("索引或是id")   进入内嵌元素iframe   切换到内嵌页面后，如果想退出回到默认内容页面需要语句：chromdriver.switchto().defaultContent()
        //chromdriver.switchTo().window("句柄值")  窗口切换时进入到新打开的窗口进行操作
        

    }
}
