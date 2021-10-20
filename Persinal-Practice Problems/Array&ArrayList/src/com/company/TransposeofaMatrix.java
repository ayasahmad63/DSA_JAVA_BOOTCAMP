package com.company;

import java.util.*;

public class TransposeofaMatrix {
    public static void main(String[] args) {
        int[][] target={{1,0},{0,1}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of row and Column");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(" ");

        boolean ans=TransposeArray(arr,target,n);
        System.out.println(ans);
//        for(int i=0;i<3;i++){
//            System.out.println(Arrays.toString(trans[i]));
//        }

    }
   static boolean TransposeArray(int[][] arr,int[][]target,int n){

          for(int i=0;i<n;i++){
              for(int j=i;j<n;j++){
                    // While initializing j=i we check the upper array only so it doesnot check twice one array
                if(i!=j){
                 arr[i][j]=arr[i][j]+arr[j][i];
                 arr[j][i]=arr[i][j]-arr[j][i];
                 arr[i][j]=arr[i][j]-arr[j][i];
              }}
          }

          int l=0;
          int r=n-1;
          while(l<=r){
              for (int i=0;i<n;i++){
                 int temp=arr[i][l];
                  arr[i][l]=arr[i][r];
                  arr[i][r]=temp;
              }
              l++;
              r--;
              if(Arrays.equals(arr,target)){
                  return true;
              }
          }


        return false;
   }

}
