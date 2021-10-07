class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ShuffleArray=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            if(i%2==0){
                ShuffleArray[i]=nums[i/2];
            }
            else{
                ShuffleArray[i]=nums[n+i/2];
            }

        }
        return ShuffleArray;
    }
}




// DEEPAK BHAIYYA CODE   //

//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[2*n];
//        for(int i=0;i<2*n;i++)
//        {
//            if(i<n)
//                ans[2*i]=nums[i];
//            else
//                ans[(2*(i-n))+1]=nums[i];
//        }
//        return ans;
//    }
//}
