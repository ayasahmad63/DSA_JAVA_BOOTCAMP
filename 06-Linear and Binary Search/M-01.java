//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int[] result={-1,-1};
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                result[1]=mid;
                start=mid+1;

            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;

            }



        }


        start=0;
        end=nums.length-1;

        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                result[0]=mid;
                end=mid-1;

            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;

            }



        }
        return result;


    }
}