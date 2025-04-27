package com.wit;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sc=new Socket("10.30.39.127",11111);
        System.out.println("连接成功");
        OutputStream op=sc.getOutputStream();
        Scanner sc1=new Scanner(System.in);
        while(true)
        {
            String str=sc1.nextLine();
            op.write(str.getBytes());
        }




    }
}
