package com.chenkai.homework;

public class Student {
    public void panDuan(String name,int age) throws IlegalNameException {
        if(name==null||name.length()<6||name.length()>10||age>20){
            throw new IlegalNameException("姓名字符长度非法，请重新输入");
        }
        System.out.println("恭喜你，高中了");
    }
}
