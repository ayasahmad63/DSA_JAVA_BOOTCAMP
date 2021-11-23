//https://leetcode.com/problems/arranging-coins/

class Solution {
    // Not concise Solution
    public int arrangeCoins(int n) {
        int start=1;
        if(n==0 || n==1){
            return n;
        }

        while(start<=n){
            if(n-start<0){
                return --start;
            }
            else{
                n=n-start;
                start++;
            }
        }
        return --start;

    }
}