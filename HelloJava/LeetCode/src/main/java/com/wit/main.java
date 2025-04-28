package com.wit;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String plainText = "666";
        byte []digest=null;
        //返回加密的MD5值
        MessageDigest md=MessageDigest.getInstance("md5");
        digest= md.digest(plainText.getBytes("utf-8"));
        String md5str=new BigInteger(1,digest).toString(16);
        System.out.println(md5str);
    }
}
