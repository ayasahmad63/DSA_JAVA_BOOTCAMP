package com.company;

//https://leetcode.com/problems/sqrtx/

public class E_01_Sqrt {
    public static void main(String[] args) {
      int x=37;

        int start=0;
        int end=x;long mid=0;
        while(start<=end){
            mid =start+(end-start)/2;

           if(x>mid*mid){
                start=(int)mid+1;
            }
            else {
                end =(int)mid-1;
            }

        }
        System.out.println(end);

    }
}
