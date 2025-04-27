package com.wit;

public class t198 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums) {

        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        else if (nums.length == 3)
            return Math.max(nums[0]+nums[2], nums[1]);

       int []dp = new int[nums.length];
       dp[0] = nums[0];
       dp[1] = nums[1];
       dp[2] = Math.max(nums[0]+nums[2], nums[1]);

       if(nums[1] == nums[0]+nums[2])
       {
           dp[3] = dp[2];
           for (int i = 4; i < nums.length; i++) {
               dp[i] = Math.max(dp[i-3] + nums[i], dp[i-2]+nums[i]);
           }
           int max1= Math.max(dp[nums.length-1], dp[nums.length-2]);


           dp[3] = Math.max(dp[1]+nums[3], dp[0]+nums[3]);
           for (int i = 3; i < nums.length; i++) {
               dp[i] = Math.max(dp[i-3] + nums[i], dp[i-2]+nums[i]);
           }
           int max2= Math.max(dp[nums.length-1], dp[nums.length-2]);
           return Math.max(max1, max2);
       }
       if(dp[2] == nums[1])//选nums[2]
       {
           dp[3] = dp[2];
           for (int i = 4; i < nums.length; i++) {
               dp[i] = Math.max(dp[i-3] + nums[i], dp[i-2]+nums[i]);
           }
           return Math.max(dp[nums.length-1], dp[nums.length-2]);
       }
       else if(dp[2]==nums[0]+nums[2])//不选nums[2]
       {
           for (int i = 3; i < nums.length; i++) {
               dp[i] = Math.max(dp[i-3] + nums[i], dp[i-2]+nums[i]);
           }
           return Math.max(dp[nums.length-1], dp[nums.length-2]);
       }
       else
           return 0;

    }
}
