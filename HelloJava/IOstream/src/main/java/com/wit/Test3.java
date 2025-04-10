package com.wit;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*FileWriter fw = new FileWriter("IOstream\\txt2\\hello.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("Hello World"+i+"\n");

        }*/

        FileReader fr = new FileReader("IOstream\\txt\\song.txt");
        BufferedReader br = new BufferedReader(fr);
        for(String s = br.readLine(); s != null; s = br.readLine()) {
            System.out.println(s);
        }

    }


}
