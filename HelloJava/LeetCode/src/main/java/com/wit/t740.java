package com.wit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t740 {
    public static void main(String[] args) {
        deleteAndEarn(new int[]{2,2,3,3,3,4});
    }
    public static int deleteAndEarn(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        Arrays.sort(nums);
        list.add(1);
        int pointer = 0;int valpointer = 0;
        if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
        {
            if(nums[0]+1 == nums[1])
                return nums[1]>nums[0]?nums[1]:nums[0];
            else
                return nums[0]+nums[1];
        }
        val.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1])
            {
                list.set(pointer, list.get(pointer)+1);
                val.set(valpointer, val.get(valpointer)+nums[i]);
            }else {
                pointer++;
                valpointer++;
                list.add(1);
                val.add(nums[i]);
            }
        }
        int[] dp = new int[list.size()];
        dp[0] = list.get(0)*val.get(0);
        if(list.get(1) == list.get(0)+1)
        {
            dp[1] = list.get(1)*val.get(1);
        }

        for (int i = 0; i < list.size(); i++) {
            dp[i] = list.get(i)*val.get(i);

        }


        return 0;
    }
}
