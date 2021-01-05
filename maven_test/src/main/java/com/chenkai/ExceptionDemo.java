package com.chenkai;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
		/*Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num=10;
		int res=0;
		try{
			num=input.nextInt();
			res=10/num;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("运算结果为："+res);
			input.close();
		}*/
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age=input.nextInt();
        try{
            Bar.enter(age);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("测试程序是否执行结束。");
            input.close();
        }
    }
}
class Bar{
    public static void enter(int age) throws  Exception/*IllegalArgumentException*/{
        if(age<18) {
            throw new Exception("未满18周岁禁止入内！！！"); //输入参数不合法，主动抛出异常
        }else {
            System.out.println("欢迎光临！！！");
        }
    }
}
