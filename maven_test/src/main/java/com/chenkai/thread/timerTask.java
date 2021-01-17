package com.chenkai.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timerTask {
    public static void main(String[] args) throws ParseException {
        Timer timer=new Timer();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime=sdf.parse("2021-01-17 15:11:30");
        timer.schedule(new longTimeTask(),firstTime,10000);
    }
}
//编写定时任务
class longTimeTask extends TimerTask{

    @Override
    public void run() {
        //编写执行任务
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=sdf.format(new Date());
        System.out.println(s+"完成了一次数据备份");
    }
}
