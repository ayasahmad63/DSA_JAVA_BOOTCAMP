package com.company;

//https://leetcode.com/problems/kth-missing-positive-number/submissions/


public class E_08_KthMissingPositivrNumber {
    public static void main(String[] args) {

        int[] arr={1,3,4};
        int k=1;


        int n=1,count=0,i=0;

        while(count<k && n<=arr[arr.length-1]){
            if(n!=arr[i]){
                count ++;
                n++;
            }
            else{
                n++;
                i++;
            }
        }
//        System.out.println(count);
        if(count<k){
            System.out.println((arr[arr.length-1]+(k-count)));
//            return();
        }

        System.out.println(--n);


    }
}
