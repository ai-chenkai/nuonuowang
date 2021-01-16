package com.chenkai.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//推荐使用这种方式
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("tmp.txt");//相对路径  起始路径是工程的目录
            byte[] b=new byte[4];
            while(true){
                int readCount=fis.read(b);
                if(readCount==-1) break;
                System.out.println(new String(b,0,readCount));
            }
/*            int readCount=fis.read(b);          //返回的是从数组中读取到的字节数量
            System.out.println(new String(b,0,readCount));   //将字节装换成字符串
            readCount=fis.read(b);  //读取剩下的字节数
            System.out.println(new String(b,0,readCount));*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
