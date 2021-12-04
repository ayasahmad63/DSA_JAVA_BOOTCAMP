package com.company;

//https://leetcode.com/problems/sort-array-by-parity/submissions/

import java.util.Arrays;

public class E_11_SortArrayByParity {
    public static void main(String[] args) {
        int[] nums={3,1,4,2};

        int i=0;

        while(i<nums.length){

            if(i+1!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;

            }else{
                i++;

            }

        }
        System.out.println(Arrays.toString(nums));
        int end=-1;
        int start=0;
        if(nums.length%2!=0){
            end=nums.length-2;
        }else{
            end=nums.length-1;
        }


        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start=start+2;
            end=end-2;

        }
        System.out.println(Arrays.toString(nums));




//        Correct Solution
//
//        class Solution {
//            public int[] sortArrayByParity(int[] nums) {
//
//                int f = 0, temp;
//                for(int i =0;i<nums.length;i++){
//                    if(nums[i]%2 == 0) {
//                        temp = nums[i];
//                        nums[i] = nums[f];
//                        nums[f++] = temp;
//                    }
//
//                }
//                return nums;
//            }
//        }

    }
}
