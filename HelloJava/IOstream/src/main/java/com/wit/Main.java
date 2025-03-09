package com.wit;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("IOstream\\txt\\hello.txt",true);//参数二为true表示追加
        fos.write("\r\n".getBytes());

        String str = "Hello world";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        fos.close();

        FileInputStream fis = new FileInputStream("IOstream\\txt\\hello.txt");
        int read;
        while((read=fis.read())!=-1){
            System.out.print((char)read);
        }
        fis.close();

    }
}
