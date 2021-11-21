package com.company;
//https://leetcode.com/problems/find-peak-element/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class E_10_PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int[] arr={0,2,1,0};

//        Linear Searchs

//        for(int i=1;i<arr.length-1;i++){
//            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
//                System.out.println("Number Foiund at  " +i);
//            }
//        }








//        Binary Search


        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if (arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){

                System.out.println(mid);
                break;

            }
            else if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else if(arr[mid+1]<arr[mid]){
                end=mid;
            }

        }
//        System.out.println(mid);







    }
}
