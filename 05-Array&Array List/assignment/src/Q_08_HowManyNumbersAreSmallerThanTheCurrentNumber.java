import java.util.Arrays;


public class Q_08_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums={6,5,4,8};
        int[] SmallerNumbe=SmallerNumbers(nums);
        System.out.println(Arrays.toString(SmallerNumbe));
    }
    static int[] SmallerNumbers(int[] nums){
        int[] SmallerNumber=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            SmallerNumber[i]=0;
            for (int j = 0; j <nums.length ; j++) {
                if(i!=j&&nums[j]<nums[i]){
                    SmallerNumber[i]++;
                }
            }

        }
        return SmallerNumber;
    }
}
