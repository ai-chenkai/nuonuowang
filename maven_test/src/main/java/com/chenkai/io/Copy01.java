package com.chenkai.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件的复制，万能的，什么文件都能复制
//FileReader与FileWrite只能对文本文件进行读写，对于word文档也不能进行读写
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建一个输入流对象
            fis=new FileInputStream("F:\\学习资料\\Git权威指南.pdf");
            //创建一个输出流对象
            fos=new FileOutputStream("D:\\Git权威指南.pdf");
            byte[] bytes=new byte[1024 * 1024];  //一次最多拷贝1Mb
            int readCount=0;
            //最核心的：一遍读，一边写
            while((readCount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }
            //刷新，输出流最后要刷新
            fos.flush();
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
