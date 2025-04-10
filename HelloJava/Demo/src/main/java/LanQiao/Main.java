package LanQiao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 10000000; i > 0; i--) {
            if (isFibo(i)) {
                System.out.println(i);
                return;
            }
        }

    }

    public static boolean isFibo(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int originalNum = num;
        // 将数字的每一位添加到列表中
        while (num > 0) {
            list.add(0, num % 10);
            num /= 10;
        }
        int n = list.size();

        // 持续生成数列，直到找到目标数字或者数列项超过目标数字
        while (true) {
            int sum = 0;
            // 计算前 n 项的和
            for (int i = list.size() - n; i < list.size(); i++) {
                sum += list.get(i);
            }
            // 将计算得到的和添加到数列中
            list.add(sum);
            if (sum == originalNum) {
                return true;
            } else if (sum > originalNum) {
                return false;
            }


        }

    }
}
