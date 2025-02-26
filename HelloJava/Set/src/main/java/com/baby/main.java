package com.baby;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class main {

    public static void main(String[] args) {
        /*
        * 增强for，lambda，迭代器
        * */

        Set<String> hashSet = new HashSet<>();
        //set继承于collection，方法与list类似
        hashSet.add("A");
        hashSet.add("A");//利用set的特性，用于去重
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");


        System.out.println(hashSet);//[A, B, C, D, E]




        //1.增强for
        for (String s : hashSet) {
            System.out.print(s);

        }
        System.out.println();

        //2.lambda

            //匿名内部类
            hashSet.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.print(s);

                }

            });
            System.out.println();

            //lambda表达式
            hashSet.forEach(s -> System.out.print(s));
            System.out.println();

        //3.迭代器
        hashSet.iterator().forEachRemaining(s -> System.out.print(s));
        System.out.println();

        System.out.println("-----------------------------set-------------------------");

        /*
        HashSet 无序、无索引、无重复（数组、链表、红黑树）
        (hashcode、equals方法重写)

        LinkedHashSet 有序、无索引、无重复
        对比hashset，多了一条双向链表，记录元素的存储顺序

        * */


        /*
        TreeSet 可排序、无索引、无重复(底层是红黑树，增删改查性能优越)
        默认Integer、String、Character排序（ASCII）
        自定义排序：(comparable接口  负数小，正数大，0相等)
                 1.JavaBean实现Comparable接口(默认)

                 2.构造方法传入比较器Comparator接口匿名内部类——————>可简化为lambda表达式
                    匿名内部类：
                    TreeSet<Student> treeSet=new TreeSet<>(new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return 0;具体使用与compareTo方法一致
                        }
                    });
                    此方法无需修改原代码



         */

        Student s1=new Student("1",1);
        Student s2=new Student("2",2);
        Student s3=new Student("3",3);
        Student s4=new Student("4",4);
        Student s5=new Student("5",5);
        Student s6=new Student("6",6);
        Student s7=new Student("7",7);


        TreeSet<Student> treeSet=new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        treeSet.add(s7);
        System.out.println(treeSet);

    }
}