package com.chenkai.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//使用这个流定义是不需要自定义char数组或byte数组
public class BufferReaderTest01 {
    public static void main(String[] args)  {
        //当一个流的构造方法需要一个流时，被传进来的是节点流，外部负责包装的是包装流
        FileReader reader = null;
        BufferedReader br=null;
        try {
            reader = new FileReader("F:\\学习资料\\资料\\Java 300\\05_常用类（共9集）\\源码\\源代码\\testDate\\src\\cn\\bjsxt\\test\\TestCalendar.java");
            br = new BufferedReader(reader);
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
