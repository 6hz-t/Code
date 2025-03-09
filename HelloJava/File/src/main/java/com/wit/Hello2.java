package com.wit;

import java.io.File;

public class Hello2 {
    public static void main(String[] args) {
        File file = new File("File","aaa");
        findcpp(file);
    }
    public static void findcpp(File file) {
        File[] list = file.listFiles();
        try {
            for (File f : list) {
                if (f.isDirectory()) {
                    findcpp(f);
                }else if(f.isFile()&&f.getName().endsWith(".cpp"))
                {
                    System.out.println(f.getAbsolutePath());
                }
            }
        } catch (NullPointerException e) {
           System.out.println("文件夹为空");
        }
    }
}
