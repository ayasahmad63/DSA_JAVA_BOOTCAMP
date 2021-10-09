import java.util.*;


public class Q_09_CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] TargetArray=createTargetArray(nums,index);
        System.out.println(Arrays.toString(TargetArray));
    }
    static  int[] createTargetArray(int[] nums,int[] index){
        int[] targetArray=new int[nums.length];
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            temp.add(index[i],nums[i]);

        }
        for(int i=0;i<nums.length;i++){
             targetArray[i]=temp.get(i);
        }



        return targetArray;
    }
}
