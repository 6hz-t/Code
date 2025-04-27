package com.wit;

import java.util.Scanner;

public class t509 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        int []arr = new int[n];
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
