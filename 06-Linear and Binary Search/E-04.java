class Solution {
//    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public int[] twoSum(int[] numbers, int target) {

        int[] ans=new int[2];
        int start=0;
        int end=numbers.length-1;

        while(start<end){

            if(numbers[start]+numbers[end]==target){
                ans[0]=start+1;
                ans[1]=end+1;
                break;
            }
            else if(numbers[start]+numbers[end]>target){
                end--;s
            }
            else
                start++;
        }



        return ans;




    }
}