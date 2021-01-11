package com.chenkai.homework;

public class StudentDemo {
    public static void main(String[] args) {
        Student xiaoming=new Student();
        try {
            xiaoming.panDuan("jackjson",18);
        } catch (IlegalNameException e) {
            e.printStackTrace();
        }
    }

}
