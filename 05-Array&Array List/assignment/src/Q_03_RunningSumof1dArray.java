import java.util.Arrays;
import java.util.EnumSet;

public class Q_03_RunningSumof1dArray {
    public static void main(String[] args) {
        int[] num={3,1,2,10,1};
        int[] runningSum=runningSum(num);
        System.out.println(Arrays.toString(runningSum));
    }
    static int[] runningSum(int[] num)
    {

      int[] runningSum=new int[num.length];
      for(int i=0;i<num.length;i++){
          for(int j=0;j<=i;j++){
              runningSum[i]+=num[j];
          }
      }

   return runningSum;
    }

}
