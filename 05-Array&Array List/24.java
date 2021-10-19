class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub=0,temp;
        if(nums.length==1){
            maxSub=nums[0];
        }
        else{
            for(int i=0;i<nums.length;i++){

                temp=nums[i];
                for(int j=i+1;j<nums.length;j++)
                {
                    temp+=nums[j];
                    if(temp>maxSub){
                        maxSub=temp;
                    }
                }
            }}
        return maxSub;
    }
}