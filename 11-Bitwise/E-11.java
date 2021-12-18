//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/


class Solution {
    public int countPrimeSetBits(int left, int right) {

        int maincount=0;

        for(int i=left;i<=right;i++){

            int temp=i;
            int count=0;
            while(temp!=0){
                count++;
                temp=temp-(temp&(-temp));
            }
            if(PrimeNumber(count)){
                maincount++;

            }

        }


        return maincount;

    }
    static  boolean PrimeNumber(int n){

        if(n==1 || n==0){
            return false;
        }

        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }


        }
        return true;
    }

}



