public class Q_16_FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums={555,901,482,1771};
        int ans=findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                temp++;
            }
            if(temp%2==0){
                ans++;
            }
        }
       return ans;

    }
}
