package LanQiao;

import java.util.Arrays;
import java.util.Scanner;

public class Minquest {
    /*
        小蓝老师教的编程课有 N
        名学生，编号依次是 1...N
        第 i
        号学生这学期刷题的数量是 Ai
        对于每一名学生，请你计算他至少还要再刷多少道题，才能使得全班刷题比他多的学生数不超过刷题比他少的学生数。
        输入格式
        第一行包含一个正整数 N
        第二行包含 N
        个整数：A1,A2,A3,...,AN
        输出格式
        输出 N
        个整数，依次表示第 1...N
        号学生分别至少还要再刷多少道题
        数据范围
        对于 30%
        的数据，1≤N≤1000 ，0≤Ai≤1000
        对于 100%
        的数据，1≤N≤100000，0≤Ai≤100000
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] a = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            if (arr[N / 2] > a[i]) {
                System.out.print(arr[N / 2] - a[i]+" ");
            } else {
                System.out.print(0+" ");
            }

        }

    }
}




