public class Q_02_Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] ans=getConcatenation(nums);

    }
    static  int[] getConcatenation(int[] nums){
        int[] ans=new int[2*nums.length];
        int n=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                ans[n]=nums[j];

                n++;

            }
        }
        return ans;
    }
}
