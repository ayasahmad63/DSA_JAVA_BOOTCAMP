import java.util.ArrayList;
import java.lang.Math;

public class Q_18_AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] nums={9,9,9,9,9,9,9,9,9};int k=1;
        ArrayList<Integer> ans=new ArrayList<>();
                ans=addToArrayForm(nums,k);
        System.out.println(ans);
    }
    static ArrayList<Integer> addToArrayForm(int[] nums,int k){
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> anss=new ArrayList<>();
        int n=0,temp;

        for(int i=0;i<nums.length;i++){
            n+=nums[nums.length-i-1 ]*Math.pow(10,i);

        }
        n=n+k;
        System.out.println(n);

        while(n>0){
           anss.add(n%10);
           n=n/10;

        }

        for(int i=anss.size();i>0;i--){
            ans.add(anss.get(i-1));

        }

        return ans;
    }


}
