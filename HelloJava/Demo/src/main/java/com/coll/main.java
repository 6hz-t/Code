package com.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("超人");
        list.add("大王");
        list.add("宝宝巴士");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.addAll(list);

        Random r=new Random();int t;

        while(list2.size()>0){
            Scanner sc=new Scanner(System.in);
            sc.nextLine();
            System.out.println(list2);
            t=r.nextInt(list2.size());
            System.out.println(list2.get(t));
            list2.remove(t);
            if(list2.size()==0){
                System.out.println("New Round");
                list2.addAll(list);
            }
        }


        System.out.println("--------------------------------------------------------------------------------");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");


        //随机抽取 0.7男 0.3女
        ArrayList<Integer> numlist = new ArrayList<>();
        Collections.addAll(numlist,0,0,0,0,0,0,0,1,1,1,1);
        int m=numlist.get(r.nextInt(numlist.size()));
        ArrayList<String> menlsit = new ArrayList<>();
        ArrayList<String> womenlsit = new ArrayList<>();
        Collections.addAll(menlsit,"张三","李四","王五","赵六","田七");
        Collections.addAll(womenlsit,"小红","小绿","小蓝","小紫","小橙");
        System.out.println(menlsit);
        System.out.println(womenlsit);
        if(m==0)
        {
            System.out.println(menlsit.get(r.nextInt(menlsit.size())));
        }else{
            System.out.println(womenlsit.get(r.nextInt(womenlsit.size())));
        }
        System.out.println("--------------------------------------------------------------------------------");




    }
}
