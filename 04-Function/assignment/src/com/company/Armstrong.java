package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        boolean isArmstong=isArmStrong(num);
       if(isArmstong==true){
           System.out.println("Given Number is Armstrong ="+num);
       }
       else{
           System.out.println("Given Number is Not Armstrong ="+num);
       }
    }
    static boolean isArmStrong(int num ){
         int temp=num,noofdigits=0,sum=0,temp1=num,temp2;
         while(temp>0){
             temp=temp/10;
             noofdigits++;
         }

         while(temp1>0){
             temp2=temp1%10;
             sum+=Math.pow(temp2,noofdigits);
             temp1=temp1/10;
         }

        return sum==num;
    }

}
