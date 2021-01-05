package com.chenkai;

import java.util.Scanner;

public class xuanzepaixu {
    int[] array;
    public int[] paiXu(int[] array){
        this.array=array;
        int min;
        int index=-1;
        for (int i = 0; i <array.length-1 ; i++) {
            min=array[i];
            for (int j = i+1; j <array.length ; j++) {
                if(min>array[j]){
                    index=j;
                    min=array[j];
                }
            }
            if(min!=array[i]){
                array[index]=array[i];
                array[i]=min;
            }
        }
        return array;
    }
}

