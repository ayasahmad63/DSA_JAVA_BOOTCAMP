package com.company;

public class JumpGame1 {
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(Jump(nums,0,0,false));
    }

 static  boolean Jump(int[] nums,int i,int n,boolean ans){
    if(n>=nums.length-1)
    {
        return true;
    }

    for(int j=i;j<nums[i]+i;j++){
         n=n+nums[j];
//            System.out.println(n);

        if(n>=nums.length-1){
             return true;

        }
        ans= Jump(nums, i + j,  n,ans);


    }

    return ans;
}}
