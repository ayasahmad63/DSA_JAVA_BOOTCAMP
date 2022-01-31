package com.company;

public class binary {
    public static void main(String[] args) {
        int[] arr={ };

        int target=0;
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                ans=mid;
                start=start+1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }




        }



        System.out.println(ans);
    }
}
