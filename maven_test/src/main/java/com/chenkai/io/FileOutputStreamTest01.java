package com.chenkai.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("myclass",true);  //以追加的方式写入
            String s="我是陈凯，是一个中国人，是一个宝藏男孩哦";
            byte[] b=s.getBytes();
            fos.write(b);
            //写完之后，最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
