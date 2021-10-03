public class Q_01_Array_From_Permutation {
    public static void main(String[] args) {
        int[] nums={5,0,1,2,3,4};
        int[]  ans = buildArray(nums);

    }
    static  int[] buildArray(int[] nums){
        // this code is for leet code
       int[] ans=new int[nums.length];
       for (int i=0;i<nums.length;i++){
           ans[i]=nums[nums[i]];
//           System.out.print(ans[i]+ " ");
       }
          return  ans;
    }
}

