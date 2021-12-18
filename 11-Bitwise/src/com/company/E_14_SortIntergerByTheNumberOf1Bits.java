package com.company;

//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/


import java.util.Arrays;

public class E_14_SortIntergerByTheNumberOf1Bits {
    public static void main(String[] args) {

        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};


        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (BitSize(arr[i]) > BitSize(arr[j]) || (BitSize(arr[i]) == BitSize(arr[j]) && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    static int BitSize(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n - (n & (-n));
        }
        return count;
    }
}
