package com.chenkai;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
     int[] array={11,2333333,-123,231,22,333,44,55,0};
     Arrays.sort(array);
     int[] b=new int[6];
     String name="陈凯";
     String name2="CHENKAI";
     System.arraycopy(array,0,b,0,5);
        for (int i = 0; i <b.length-1 ; i++) {
            System.out.println(b[i]);
        }
        String name1="chenkai";
        String id="chenkaiabc";
        System.out.println(name.isEmpty());
        System.out.println(name.replace("kai","kaige"));
        System.out.println(name);
        System.out.println(name.compareTo(id));
        char[] c=name1.toCharArray();
        System.out.println(name2.toLowerCase());
        for (int i = 0; i <c.length-1; i++) {
            System.out.println(c[i]);
        }
    }
}
