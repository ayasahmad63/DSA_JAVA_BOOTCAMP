package com.company;

//https://leetcode.com/problems/arranging-coins/

public class E_06_ArragingCoins {

    public static void main(String[] args) {
int n=5;
        int start=1;
        if(n==0 || n==1){
            System.out.println(n);
        }

        while(start<=n){
            if(n-start<0){
                System.out.println(--start);
            }
            else{
                n=n-start;
                start++;
            }
        }
        System.out.println(--start);

    }

}
