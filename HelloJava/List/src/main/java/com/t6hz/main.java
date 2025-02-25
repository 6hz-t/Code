package com.t6hz;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();


        /*索引  0-n
        *remove 重载方法优先
        *
        * */
        //add remove set get
        list.add("1");
        list.add("2");
        list.add("3");


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



    }
}
