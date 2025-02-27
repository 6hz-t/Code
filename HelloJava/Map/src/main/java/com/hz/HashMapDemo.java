package com.hz;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {


   /* 用key计算hash值，底层与HashSet一样（哈希表）
    存储自定义对象时重写HashCode(),equals()方法，保证key的唯一性
    HashMap的key是唯一的(覆盖)，value是可重复*/


	public static void main() {
        Map<Student,String> map = new HashMap<>();
        Student s1 = new Student("John Doe", 22);
        Student s2 = new Student("Tom Jerry", 20);
        Student s3 = new Student("Mei Mei", 18);
        Student s4 = new Student("Mei Mei", 18);

        map.put(s1,"John Doe");
        map.put(s2,"Tom Jerry");
        map.put(s3,"Mei Mei1");
        map.put(s3,"Mei Mei2");

        map.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("---------------------------------------------------------------------------");

        System.out.println(map.get(s1));
        System.out.println(map.get(s2));
        System.out.println("---------------------------------------------------------------------------");



        System.out.println("---------------------------------------------------------------------------");



    }
}
