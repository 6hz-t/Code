package com.hz;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
/*
    原理与TreeSet相同(增删改查性能优越)
    存储自定义对象时，需要指定排序规则
    排序规则:
        自然排序: 自定义类实现Comparable接口，重写compareTo方法
        比较器排序: 创建对象实现Comparator，重写compare方法
    正数升序
        */

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                }
        );
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        System.out.println(treeMap);

    }
}
