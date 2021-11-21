package com.company;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class M_01_FindFastAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {

        int[] nums={5,7,8,8,8,10};
        int[] result={-1,-1};
        int target =8;
        int start=0;
        int end=nums.length-1;

          int mid=0;

          while(start<=end){
              mid=start+(end-start)/2;
               if(nums[mid]==target){
                  result[0]=mid;
                   start=mid+1;

              }
               else if(target<nums[mid]){
                   end=mid-1;
               }
               else if(target>nums[mid]){
                   start=mid+1;

               }



          }
        System.out.println(result[0]);

        start=0;
         end=nums.length-1;

        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                result[1]=mid;
                end=mid-1;

            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;

            }



        }
        System.out.println(result[1]);





}
}