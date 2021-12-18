package com.company;


//https://leetcode.com/problems/binary-number-with-alternating-bits/submissions/

public class E_10_BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {

        int n=5;

        int n1=n&1;
        n=n>>1;
        while(n!=0){
            int n2=n&1;
            if(n1 == n2){
                System.out.println(false);
            }
            n1=n2;
            n=n>>1;
        }


        System.out.println(true);
    }
}

