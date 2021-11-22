class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;long mid=0;
        while(start<=end){
            mid =start+(end-start)/2;

            if(mid*mid==x){
                return (int)mid;
            }
            else if(x>mid*mid){
                start=(int)mid+1;
            }
            else {
                end =(int)mid-1;
            }

        }
        return end;
    }
}