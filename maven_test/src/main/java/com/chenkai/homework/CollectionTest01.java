package com.chenkai.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(100);
        c.add("hello world");
        c.add(new Object());
        Iterator it=c.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
