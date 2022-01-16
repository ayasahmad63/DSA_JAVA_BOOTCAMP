package com.company;

public class MaxAreaOfIsland {
    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int max = 0;
        for (int i = 0; i < grid.length-1 ; i++) {
            for (int j = 0; j < grid[0].length-1 ; j++) {
                if (grid[i][j] == 1) {
                    int count = Island(grid, i, j, 0);
                   if(count>max)max=count;


                }

            }
        }
        System.out.println(max);
    }

    static int[] hori = {-1, 0, 1, 0};
    static int[] verti = {0, -1, 0, 1};


    static int Island(int[][] arr, int m, int n, int ans) {
        if (m <= 0 || n <= 0 || m > arr.length-1 || n > arr[0].length-1) {
            return ans;
        }

        if (arr[m][n] == 1) {
            arr[m][n] = 2;
             ans++;

            for (int i = 0; i < 4; i++) {
                ans=Island(arr, m + hori[i], n + verti[i], ans);
            }
        }


        return ans;
    }
}
