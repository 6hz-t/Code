package com.wit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("IOstream\\txt\\hello.txt");
            char[] chars = new char[2];
            int read;

            //底层会创建8192大小的数组，每次读取8192个字符，然后返回读取的字符数量，当读取到文件末尾时，返回-1
            System.out.println("——————first————————");
            while ((read = fr.read(chars)) != -1) {
                System.out.print(new String(chars, 0, read));
            }
            System.out.println();
            System.out.println("——————second————————");

            fr=new FileReader("IOstream\\txt\\hello.txt");
            while ((read = fr.read()) != -1) {
                //底层为字节流，所以要强转
                System.out.print((char)read);
            }
            /*
            read()带参和无参的区别：
            1.无参：每次读取一个字符，返回读取的字符的ASCII码值，如果读取到文件末尾，返回-1
            2.带参：每次读取指定长度的字符，返回读取的字符数量，如果读取到文件末尾，返回-1
            * */

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
