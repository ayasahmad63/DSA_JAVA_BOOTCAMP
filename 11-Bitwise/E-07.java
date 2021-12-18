//https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {


        int count =0;
        x=x^y;
        while(x!=0){
            count++;
            x=x-(x&(-x));
        }



        return count;


    }
}