package com.t6hz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();


        /*索引  0-n
        *remove 重载方法优先
        *
        * */
        /*
        * list四个方法子类都可以使用*/
        //add remove set get
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Collections.shuffle(list);

        System.out.println(list);


        //遍历
        /*
        * 1.增强for
        * 2.lambda（foreach方法，重写）
        * 3.迭代器（删除元素只能用迭代器）
        * 4.普通for循环（list有索引）
        *
        *
        *
        * */


        /*
        * Collections方法
        * 1.sort 排序
        * 2.shuffle 随机排序
        * 3.reverse 反转
        * 4.swap 交换
        * 5.max min
        * 6.frequency 出现次数
        * 7.copy 复制
        * 8.fill 填充
        * 9.replaceAll 替换
        * 10.binarySearch 二分查找
        * 11.synchronizedList 线程安全
        * */


    }
}
