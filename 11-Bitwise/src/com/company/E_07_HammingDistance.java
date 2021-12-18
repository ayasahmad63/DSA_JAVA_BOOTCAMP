package com.company;

//https://leetcode.com/problems/hamming-distance/?

public class E_07_HammingDistance {
    public static void main(String[] args) {

        int x=93;int y=73;
        int count=0;



        x=x^y;
        while(x!=0){
            count++;
            x=x-(x&(-x));
        }


        System.out.println(count);

//        System.out.println(count);
    }
}
