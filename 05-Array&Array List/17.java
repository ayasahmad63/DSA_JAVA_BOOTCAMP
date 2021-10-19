class Solution {
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        if(matrix.length==matrix[0].length)
        {
            int arr[][] = new int[matrix.length][matrix[0].length];

            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    arr[i][j]=matrix[j][i];
                }
            }
            return arr;
        }

        else
        {
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=matrix[j][i];
                }
            }
            return arr;
        }


    }
}