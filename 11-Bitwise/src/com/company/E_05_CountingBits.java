package com.company;

//https://leetcode.com/problems/counting-bits/

public class E_05_CountingBits {
    public static void main(String[] args) {
        int n = 5;



        int[] ans=new int[n+1];

        for(int i=0;i<=n;i++){

            int temp=i;
            int count=0;
            while(temp != 0){

                temp=temp & (temp-1);
                count++;

            }
            ans[i]=count;

        }

        System.out.println(ans);

    }
}
