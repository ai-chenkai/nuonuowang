package com.chenkai;

import java.util.Scanner;

public class erfen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个要查询的数：");
        int num=sc.nextInt();
        int[] array={11,22,33,44,55,66,77,88};
        int start=0;
        int end=array.length-1;
        int middle;
        int index=-1;
        while(start<=end){
            middle=(start+end)/2;
            if (num==array[middle]){
                index=middle;
                break;
            }else if(num>array[middle]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        if(index!=-1){
            System.out.println("恭喜小二查询到了！位于第"+(index+1)+"个元素");
        }else{
            System.out.println("抱歉，客观，小二努力了，找不到");
        }
    }
}
