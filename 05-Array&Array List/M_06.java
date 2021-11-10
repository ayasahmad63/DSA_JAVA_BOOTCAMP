class Solution {
    public void rotate(int[] nums, int k) {
        k=k+nums.length;
        k=k%nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);


    }


    void reverse(int[] arr,int start,int end){
        while(start<end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }

    }
}