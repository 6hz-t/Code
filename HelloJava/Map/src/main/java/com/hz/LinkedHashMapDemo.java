package com.hz;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    //有序，不重复，无索引
    public static void main() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("zzz",333);
        linkedHashMap.put("aaa",1);
        linkedHashMap.put("bbb",2);
        linkedHashMap.put("ccc",3);
        linkedHashMap.put("ddd",4);
        linkedHashMap.put("aaa",111);

        System.out.println(linkedHashMap);


    }
}
