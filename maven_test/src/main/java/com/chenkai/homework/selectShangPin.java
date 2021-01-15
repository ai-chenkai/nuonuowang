package com.chenkai.homework;

import java.util.HashMap;
import java.util.Map;

public class selectShangPin {
    public static void main(String[] args) {
        shangpin s1=new shangpin();
        shangpin s2=new shangpin();
        System.out.println(s1==s2);
        Map m=new HashMap();
        m.put(s1,1);
        m.put(s2,2);
        System.out.println(m.size());
    }
}
