package com.company;

public class M_03_TargetSum {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1}; int target=3;

         findTargetSumWays(nums,target);

    }
    public static int findTargetSumWays(int[] nums, int target) {

        int count= targetSum(nums,target,0,0);
        return count;

    }
     static int targetSum(int[] nums,int target,int i,int count){
        if(target==0 && i==nums.length){
            count++;
            return count;
        }
        if(i>=nums.length){
            return 0;
        }

        return targetSum(nums,target+nums[i],i+1,count) + targetSum(nums,target-nums[i],i+1,count);

    }
}
