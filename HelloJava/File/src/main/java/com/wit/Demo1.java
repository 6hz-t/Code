package com.wit;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Git\\Repo\\Code\\HelloJava\\File\\src\\main\\src\\test.txt");
        //System.out.println(file.getAbsolutePath());

        File f1=new File("File\\aaa");
        System.out.println(f1.mkdirs());
        File f2=new File(f1,"aaa.txt");
        System.out.println(f2.createNewFile());
        File f3=new File("File\\bbb");
        System.out.println(f1.mkdirs());

        System.out.println(func(f1));
        System.out.println(func(f3));



    }
    public static boolean func(File file) {
        File[] list = file.listFiles();
        try {
            for (File s : list) {
                if(s.isFile()&&s.getName().endsWith(".txt")) {
                    return true;
                }
            }
        }catch (NullPointerException e) {
            System.out.print("文件夹为空 ");
            return false;
        }
        return false;
    }
}
