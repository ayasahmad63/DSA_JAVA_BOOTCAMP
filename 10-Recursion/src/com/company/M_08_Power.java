package com.company;

public class M_08_Power {
    public static void main(String[] args) {


        System.out.println(power(2.00000,10,0.000000));
    }
    static double power (double x,int n,double ans){
        if(n==0){
            return 1.00000;

        }

        if(n%2==0){
            return power(x,n/2,ans*ans);
        }

        return  power(x,n-1,ans*x);
    }
}
