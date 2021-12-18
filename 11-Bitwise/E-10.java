//https://leetcode.com/problems/binary-number-with-alternating-bits/


class Solution {
    public boolean hasAlternatingBits(int n) {

        int n1=n&1;
        n=n>>1;
        while(n!=0){
            int n2=n&1;
            if(n1 == n2){
                return false;
            }
            n1=n2;
            n=n>>1;
        }


        return true;

    }
}