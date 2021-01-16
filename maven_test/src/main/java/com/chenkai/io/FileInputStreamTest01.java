package com.chenkai.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("tmp.txt");   //相对路径  起始路径是项目工程的目录
            System.out.println("总字节数:"+fis.available());
            byte[] a=new byte[fis.available()];    //这种方式不太适合大文件，因为数组不能太大
            int readCount=fis.read(a);
            System.out.println(new String(a));
/*           //开始读
            while(true){
                int readData=fis.read();
                if(readData==-1) break;
                System.out.println(readData);
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {                       //finally语句中确保流一定关闭
            if (fis != null) {            //避免空指针异常    关闭的前提是流不是空
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
