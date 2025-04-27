package com.wit;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(11111);
        Socket socket = server.accept();
        InputStream in= socket.getInputStream();
        int b;

        while ((b = in.read()) != -1) {
            System.out.print((char) b);
        }









    }
}
