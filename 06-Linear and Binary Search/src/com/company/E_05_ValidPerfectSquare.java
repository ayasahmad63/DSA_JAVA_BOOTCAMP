package com.company;

public class E_05_ValidPerfectSquare {
    public static void main(String[] args) {
//        int num=16;
        int num=14;

        int start=0;
        int end=num;

        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==num){
                System.out.println("true");
            }
            else  if(mid*mid>num){
                end=(int)mid-1;
            }
            else {
                start=(int)mid+1;
            }
        }


        System.out.println("false");

    }
}
