import java.util.Arrays;

import java.util.*;


public class Q_07_NumberOfGoodsPairs {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        int n=GoodPair(nums);
        System.out.println(n);

    }
    static  int GoodPair(int[] nums){
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    temp++;
                }
            }
        }


        return temp;
    }
}
