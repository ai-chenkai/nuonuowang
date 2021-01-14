package com.chenkai.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class collectionTest02 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap();
        m.put(1, "hello");
        m.put(2, "world");
        m.put(3, "张三");
        m.put(4, "赵四");
        System.out.println(m.size());
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("张三"));
        m.remove(1);
        System.out.println(m.size());
        System.out.println(m.replace(2, "world", "kitty"));
/*      Set<Integer> s = m.keySet();
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            String y = m.get(x);   //获取键所对应的Value
            System.out.println(x + "-->" + y);
*/
/*
    //转换成Set在进行遍历 推荐使用这种
    //Set集合中的元素类型是Map.Entry
    Set<Map.Entry<Integer,String>> x=m.entrySet();
        for (Map.Entry<Integer,String> node:x) {
        System.out.println(node.getKey()+"="+node.getValue());
    }
*/
        System.out.println(m.isEmpty());
        }

    }

