class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];



        int[] leftmul=new int[nums.length];
        int[] rightmul=new int[nums.length];

        leftmul[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            leftmul[i]=nums[i]*leftmul[i-1];

        }

        rightmul[nums.length-1]=nums[nums.length-1];
        for(int i= nums.length-2;i>= 0;i--){
            rightmul[i]=nums[i]*rightmul[i+1];

        }

        answer[0]=rightmul[1];answer[answer.length-1]=leftmul[leftmul.length-2];
        for(int i=1;i< answer.length-1;i++){
            answer[i]=leftmul[i-1]*rightmul[i+1];
        }
        return answer;

    }
}