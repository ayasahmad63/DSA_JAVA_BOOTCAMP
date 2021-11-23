package com.company;


//https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> triplet = new ArrayList<>();

        int[] nums = {-1, 0, -1, 2, -1, -4};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        ans.add(triplet);
                        triplet.remove(0);
                        triplet.remove(1);
                        triplet.remove(2);


                    }

                }
            }
        }

        System.out.println("jdida");


    }
}


