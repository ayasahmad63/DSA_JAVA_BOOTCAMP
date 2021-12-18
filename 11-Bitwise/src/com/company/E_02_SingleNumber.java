package com.company;


//https://leetcode.com/problems/single-number/submissions/


public class E_02_SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};

        int x=0;
        for(int n:nums){
            x=x^n;
        }
        System.out.println(x);


    }
}
