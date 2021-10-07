import java.util.Arrays;

public class Q_06_KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies={12,1,12};
        int extraCandies=10;
        boolean[] result=kidsWithCandies(candies,extraCandies);
        System.out.println(Arrays.toString(result));
    }
    static boolean[] kidsWithCandies(int[] candies,int extraCandies){
        boolean[] result=new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
         int temp=candies[i]+extraCandies;
         for(int j=0;j<candies.length;j++){
             if(candies[j]>temp){
                 result[i]=false;
                 break;
             }
             if(j==candies.length-1){
                 result[i]=true;
                 break;
             }
           }

        }

        return result;
    }




}
