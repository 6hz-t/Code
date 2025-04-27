package com.wit;

import java.util.Scanner;

public class t70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if(i==0)
                arr[i]=0;
            else if(i==1)
                arr[i]=1;
            else
                arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[arr.length-1]);
    }
}
