package com.company;

public class E_03_MissingNumber {

    public static void main(String[] args) {

   int[] nums={3,0,1};

   int c=missingNumber(nums);
        System.out.println(c);


   }


    static int missingNumber(int[] nums) {

        int i=0;

        while(i<nums.length)
        {
            int correct=nums[i];

            if(nums[i]==nums.length){
             i++;

            }
            else if(nums[i]!=i){
                int temp=nums[i];
               nums[i]= nums[nums[i]];
                nums[nums[i]]=temp;
            }
            else{
                i++;
            }

        }

        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }




        return nums.length;

    }



}
