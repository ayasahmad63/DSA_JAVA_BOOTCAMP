import java.util.Arrays;

public class Q_22_FindNUniqueIntegerSumUpToZero {

    public static void main(String[] args) {
        int n = 5;
        int[] ans = Sumzero(n);

        System.out.println(Arrays.toString(ans));


    }

    static int[] Sumzero(int n) {
        int[] ans = new int[n];
        if (n % 2 == 2) {
            for (int i = 0; i < n; i+=2) {

                    ans[i] = i+1;
                    ans[i+1]= -(i+1);

            }
        } else {
            ans[0] = 0;
            for (int i = 1; i < n; i+=2) {

                    ans[i] = i+1;

                    ans[i+1] =  -(i+1);

            }


        }
        return ans;
    }
}


