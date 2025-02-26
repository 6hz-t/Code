package com.baby;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class main {

    public static void main(String[] args) {
        /*
        * 增强for，lambda，迭代器
        * */

        Set<String> set = new HashSet<>();
        //set继承于collection，方法与list类似
        set.add("A");
        set.add("A");//利用set的特性，用于去重
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");


        System.out.println(set);//[A, B, C, D, E]




        //1.增强for
        for (String s : set) {
            System.out.print(s);

        }
        System.out.println();

        //2.lambda

            //匿名内部类
            set.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.print(s);

                }

            });
            System.out.println();

            //lambda表达式
            set.forEach(s -> System.out.print(s));
            System.out.println();

        //3.迭代器
        set.iterator().forEachRemaining(s -> System.out.print(s));
        System.out.println();

        System.out.println("-----------------------------set-------------------------");

        /*
        HashSet 无序、无索引、无重复(hashcode、equals方法重写)
             组成（数组、链表、红黑树）

        LinkedHashSet 有序、无索引、无重复
        对比hashset，多了一条双向链表，记录元素的存储顺序

        * */


        /*
        TreeSet 可排序、无索引、无重复
        默认Integer、String、Character排序（ASCII）




         */

    }
}