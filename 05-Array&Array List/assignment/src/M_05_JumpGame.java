public class M_05_JumpGame {
    public static void main(String[] args) {

        int[] nums={3,2,1,0,4};
        int st=nums[0];
        for(int i=1;i<=st+1;i++){

            for(int j=i+1;j<=nums[i]+i;j++){
                if(j>=nums.length-1){
                    System.out.println("True");
                }
            }
        }


        System.out.println("False");



    }
}
