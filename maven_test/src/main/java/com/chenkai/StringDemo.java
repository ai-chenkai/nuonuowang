package com.chenkai;

public class StringDemo {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);

        String s3=new String("abc");
        String s4=new String("abc");
        System.out.println(s3==s4);


        String str="My Friend,Your are my best friend.";
        System.out.println(str.charAt(0));//一般情况调用方法的语法：对象名.方法名(参数)
        System.out.println(str.compareTo("MY"));//M-m=-32

        System.out.println(str.concat("I lied."));
        System.out.println(str);
		/*str+="I lied.";
		System.out.println(str);*/
        String [] array=str.split(" ");

        for(String i:array) {
            System.out.println(i);
        }

        for(int i=array.length-1;i>=0;i--) {
            System.out.println(array[i]);
        }

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        //使用static修饰的方法，称为静态方法，调用静态的方法语法：类名.方法名()
        String string=String.valueOf(10.0);//将传入的布尔类型的参数转换为字符串类型
        System.out.println(string);
        System.out.println(str.indexOf('.'));
        System.out.println(str.length());
        System.out.println(str.indexOf('y',5));
    }
}
