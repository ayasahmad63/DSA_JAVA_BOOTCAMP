class Solution {
    public boolean canJump(int[] nums) {
        int maxJump=0;

        // maxJump is the maximum distance that we can reach
        // so i (current) that can never be > maxJump.

        for(int i=0;i<=maxJump;i++)
        {
            if(maxJump>= nums.length-1)
                return true;
            maxJump=Math.max(i+nums[i],maxJump);
        }
        return false;



    }
}