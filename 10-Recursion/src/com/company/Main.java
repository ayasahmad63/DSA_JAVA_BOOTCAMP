package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] coins={4,3,5,1};
int N=4;
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                if(coins[i]<coins[j]){
                    int temp=coins[i];
                    coins[i]=coins[j];
                    coins[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(coins));
    }
}
