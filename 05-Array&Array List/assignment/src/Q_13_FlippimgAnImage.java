public class Q_13_FlippimgAnImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] ans=flipAndInvertImage(image);
//        System.out.println(Arrays.toString(ans));
    }
    static int[][] flipAndInvertImage(int[][] image){
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
                System.out.print(ans[i][j]);

            }
            System.out.println(" ");
        }
        return ans;
    }

}
