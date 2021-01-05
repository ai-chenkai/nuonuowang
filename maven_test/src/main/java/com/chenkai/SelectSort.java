package com.chenkai;
/*
选择排序法：
工作原理：首先在未排序序列中找到最小元素，存放到排序序列的起始位置，
然后，再从剩余未排序的元素中继续寻找最小的元素，然后放到排序序列起始位置的后一位。
以此类推，直到所有元素均排序完毕为止。
*/
public class SelectSort {
    public static void main(String [] args){
        int [] array={100,300,233,-111,190,890,999,455,233};
        int index=-1;
        int min;
        for(int i=0;i<array.length-1;i++){//比较的轮次,array.length-1表示4个数据需要比较3次
            min=array[i];
            for(int j=i+1;j<array.length;j++){//遍历数组
                if(min>array[j]){         //判断数组中的元素是否比最小值还要小
                    index=j;
                    min=array[j];
                }
            }
            if(min!=array[i]){
                array[index]=array[i];
                array[i]=min;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
