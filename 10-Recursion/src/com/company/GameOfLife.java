package com.company;

import java.util.Arrays;

public class GameOfLife {
    static int[] verti={-1,0,1,0,-1,1,-1,1};
    static int[] horizo={0,-1,0,1,-1,1,1,-1};
    public static void main(String[] args) {
        int[][] arr={
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            {
               int sum=0;
                for(int k=0;k<8;k++){
                   sum=sum+life(arr,i+horizo[k],j+verti[k]);

                }
                if(arr[i][j]==0){
                    if(sum == 3){
                        arr[i][j]=1;
                    }
                }
                else{
                    if(sum<2  || sum>3){
                        arr[i][j]=0;
                    }
                }

            }
        }
//
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static int life(int[][] arr,int m,int n){

        if(m<0 || n<0 || m>arr.length-1 || n>arr[0].length-1){
            return 0;
        }
        if(arr[m][n]==0){
            return 0;
        }
        else {
            return 1;
        }

    }



}
