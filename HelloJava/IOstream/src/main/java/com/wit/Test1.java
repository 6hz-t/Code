package com.wit;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test1 {
    public static void main(String[] args) throws IOException {

       FileInputStream fis = new FileInputStream("IOstream\\txt\\hello.txt");
       FileOutputStream fos = new FileOutputStream("IOstream\\txt2\\hello.txt");
       int read;

       Date date = new Date();
       long time = date.getTime();
       byte[] bytes = new byte[4];

       while((read=fis.read(bytes))!=-1){
           System.out.println(new String(bytes,0,read));
           fos.write(read);
       }


       Date date2 = new Date();
       long time2 = date2.getTime();
       System.out.println("复制文件用时："+(time2-time)+"ms");

















       fos.close();fis.close();

    }
}
