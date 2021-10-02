package com.company;

import java.util.Scanner;

public class PrimeNo {
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        boolean ans = prime(n);
//        System.out.println(ans);

        if(ans=false){
            System.out.println("Number is not Prime ="+n);
        }
        else{
            System.out.println("Number is Prime ="+n);
        }
    }
    static  boolean prime(int n) {
        int c=2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
            c++;
        }



        return c*c>n;
    }
}
