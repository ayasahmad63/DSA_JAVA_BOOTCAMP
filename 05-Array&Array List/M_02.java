class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list= new ArrayList<Integer>();


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);

                }
            }
        }


        for(int i=0;i<list.size();i=i+2){
            int m=list.get(i);
            int n=list.get(i+1);

            for(int j=0;j<matrix[0].length;j++){
                matrix[m][j]=0;

            }

            for(int k=0;k<matrix.length;k++){
                matrix[k][n]=0;

            }

        }

    }
}





//  Deepak Bhaiyya Code


class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> store = new ArrayList<>();

        for (int i=0;i< matrix.length;i++)
        {
            for (int j=0;j< matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                    store.add(new ArrayList<Integer>(Arrays.asList(i,j)));
            }
        }

        for (int i=0;i< store.size();i++)
        {
            makeItZero(matrix,store.get(i).get(0),store.get(i).get(1));
        }
    }

    void makeItZero(int[][] matrix,int row,int col)
    {
        for(int j=0;j< matrix[0].length;j++)
            matrix[row][j]=0;
        for (int i=0;i< matrix.length;i++)
            matrix[i][col]=0;
    }
}

