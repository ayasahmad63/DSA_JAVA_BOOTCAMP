import java.util.*;

public class Q_05_ShuffleTheArray {

    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] ShuffleArray=ShuffleArray(nums,n);
        System.out.println(Arrays.toString(ShuffleArray));
    }
    static int[] ShuffleArray(int[] nums, int n){
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
