package com.chenkai;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array={1,3,44,55,66,78,97,444,3333,10000};
        Scanner input=new Scanner(System.in);
        int start=0;
        int middle;
        int index=-1;
        int end=array.length-1;
        System.out.println("请输入你想查找的数：");
        int num=input.nextInt();
        while(start<=end){
            middle=(start+end)/2;
            if(num==array[middle]){
                index=middle;
                break;
            }else if(num>array[middle]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        if(index!=-1){
            System.out.print("您查询的数据位于第"+(index+1)+"个元素");
        }else{
            System.out.println("抱歉，您输入的数据小二查不到");
        }
    }

}
