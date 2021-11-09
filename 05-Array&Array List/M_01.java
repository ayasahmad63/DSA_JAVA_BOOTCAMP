class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int maxr=matrix.length;
        int maxc=matrix[0].length;
        int num=maxr*maxc;
        int count=0,minr=0,minc=0;

        while(count<num){
            for(int i=minr,j=minc;j<maxc && count<num;j++ ){
                res.add(matrix[i][j]);
                count++;
            }
            for(int i=minr+1,j=maxc-1;i<maxr && count<num;i++){
                res.add(matrix[i][j]);
                count++;
            }

            for(int i=maxr-1,j=maxc-2;j>=minc && count<num;j--){
                res.add(matrix[i][j]);
                count++;
            }

            for(int i=maxr-2,j=minc;i>minr && count<num;i--){
                res.add(matrix[i][j]);
                count++;
            }
            minc++;
            minr++;maxc--;maxr--;


        }




        return res;
    }
}