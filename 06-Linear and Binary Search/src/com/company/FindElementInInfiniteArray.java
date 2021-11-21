package com.company;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=8;
        int start=0;
        int end=1;
        int newstart=0;
        while(target>arr[start] && target<arr[end]){

        newstart=end+1;
        end=end+(end-start+1)*2;
    }



    while(newstart<=end) {
        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            System.out.println("Number was found at index  " + mid);
            break;
        } else if (target < arr[mid]) {
            end = mid - 1;
        } else {
            start = start + 1;
        }
    }
    }




}
