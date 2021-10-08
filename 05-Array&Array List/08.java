class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] SmallerNumber=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            SmallerNumber[i]=0;
            for(int j=0;j<nums.length;j++){
             if(j!=i&&nums[j]<nums[i])
                 SmallerNumber[i]++;
            }
        }
        return SmallerNumber;
    }
}