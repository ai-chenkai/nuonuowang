package com.chenkai;

public class stackTest {
    public static void main(String[] args) {
        System.out.println("mainBegin");
        int m=100;
        ceshi1(m);
        System.out.println("mainOver");
    }
    public static void ceshi1(int i){
        System.out.println("main1Begin");
        ceshi2(i);
        System.out.println("main1Over");
    }
    public static void ceshi2(int i){
        System.out.println("main2Begin");
        System.out.println(i);
        System.out.println("main2Over");
    }
}
