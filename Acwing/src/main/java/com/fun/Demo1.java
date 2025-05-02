package com.fun;


import java.util.Scanner;



public class Demo1 {
    public static void main(String[] args) {
        int N,V;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        V = sc.nextInt();

        int v[]=new int[N+1];
        int w[]=new int[N+1];

        for(int i=1;i<=N;i++){
            v[i]=sc.nextInt();
            w[i]=sc.nextInt();            
        }

        int k[][]=new int[N+1][V+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=V;j++){
                if (j >= v[i]){
                    k[i][j]=Math.max(k[i-1][j],k[i-1][j-v[i]]+w[i]);
                }else {
                    k[i][j]=k[i-1][j];
                }
            }
        }
        System.out.println(k[N][V]);
    }
}
