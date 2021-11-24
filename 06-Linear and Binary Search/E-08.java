//https://leetcode.com/problems/kth-missing-positive-number/submissions/

class Solution {
    public int findKthPositive(int[] arr, int k) {


        int n=1,count=0,i=0;

        while(count<k && n<=arr[arr.length-1]){
            if(n!=arr[i]){
                count ++;
                n++;
            }
            else{
                n++;
                i++;
            }
        }

        if(count<k){
            return((arr[arr.length-1]+(k-count)));
        }


        return --n;
    }


}