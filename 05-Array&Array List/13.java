class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image[0].length];
        int n=image.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                ans[i][j]=image[i][n-j-1];
                if(ans[i][j]==1){
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=1;
                }

            }
        }
        return ans;
    }
}