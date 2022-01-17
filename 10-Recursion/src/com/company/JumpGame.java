package com.company;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(Jump(nums,0,0,0));
    }
    static  int Jump(int[] nums,int i,int ans,int n){
        if(n>=nums.length-1)
        {
            return ans;
        }

        for(int j=i;j<nums[i]+i;j++){
            ans++; n=n+nums[j];
//            System.out.println(n);

            if(n>=nums.length-1){

                break;
            }
                ans= Jump(nums, i + 1, ans, n);


        }

        return ans;
    }
}
