package com.company;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number a");
        int a=sc.nextInt();
        System.out.println("Enter the Number b");
        int b=sc.nextInt();

        System.out.println("The Greatest Common Divisor of " +a+ " and " +b+ " is = " +GCD(a,b));
    }

    static int GCD(int a,int b){
        int GCD=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                GCD=i;
            }
        }

        return GCD;
    }
}
