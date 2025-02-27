package com.hz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.lang.*;
import java.util.function.BiConsumer;

import static java.lang.System.out;


public class main {
    /*
    Map 双列集合 键key 值value 键值对Entry(getkey getvalue)

    Map --HashMapDemo
        --TreeMap
        --......
    统计思想：
        1.计数器
        2.Map集合(新)
        如果结果需要排序，使用TreeMap
        如果结果不需要排序，使用HashMap

     */
    public static void main(String[] args) {
        out.println();

/*
方法:
        put 添加/覆盖(如果key已有值,则覆盖，返回值为被覆盖的value)
        get(key) 获取value
        remove(key) 删除
        clear 清空
        containsKey 是否包含key
        containsValue 是否包含value
        size 长度
        isEmpty 是否为空*/

        Map<String,String> map = new HashMap<>();
        map.put("A","aa");//添加
        map.put("B","bb");
        map.put("C","cc");
        map.put("A","aaa");//覆盖
        map.put("F","fff");
        map.put("E","eee");
        map.put("G","ggg");
        map.put("H","hhh");
        map.put("I","iii");
        out.println(map);

        map.put("D","dd");
        out.println(map);

        map.remove("A");//删除
        out.println(map);

        //map.clear();//  清空
        //System.out.println("Cleared:"+map);

        out.println("-------------------------------------------------------------------------------------------");


 /*
 遍历方式:
        1. 键找值
            获取所有键keyset()方法
        2. 键值对
        3. lambda表达式
        */

        //键找值
        out.println("键找值：");
        Set<String> keys = map.keySet();//获取所有键
        out.println(keys);
        for (String key : keys) {
            out.print(key+":"+map.get(key)+"  ");
        }
        out.println();
        out.println("-------------------------------------------------------------------------------------------");

        //增强for循环
        out.println("键值对：");
        Set<Map.Entry<String,String>> entries = map.entrySet();//获取所有键值对
        for(Map.Entry<String,String> entry : entries) {
            out.print(entry.getKey()+":"+entry.getValue()+"  ");
        }
        out.println();
        out.println("-------------------------------------------------------------------------------------------");

        //lambda表达式
        out.println("lambda表达式：");
        //简化前

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                out.print(key+":"+value+"  ");
            }
        });
        //简化后
        map.forEach((key,value)->out.print(key+":"+value+"  "));
        out.println("-------------------------------------------------------------------------------------------");





    }

}
