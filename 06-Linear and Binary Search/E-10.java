//https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
            {
                return mid;

            }
            else if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else if(arr[mid+1]<arr[mid]){
                end=mid;
            }
        }
        return mid;


    }
}
