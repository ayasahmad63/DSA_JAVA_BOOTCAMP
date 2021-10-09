class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] TargetArray=new int[nums.length];
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            temp.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            TargetArray[i]=temp.get(i);
        }

        return TargetArray;

    }
}