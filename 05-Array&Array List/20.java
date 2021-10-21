class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        if(checkEqual(mat,target))
            return true;

        for(int i=0;i<3;i++)
        {
            reverseArray(mat);
            if(checkEqual(mat,target))
            {
                return true;
            }
        }

        return false;
    }

    void reverseArray(int[][] mat)
    {
        // REVERSE = TRANSPOSE + FLIP 180 degree
        int n= mat.length;

        // transpose
        for(int i=0;i< mat.length;i++)
        {
            for (int j=i+1;j<mat.length;j++)
            {
                int temp=mat[j][i];
                mat[j][i]=mat[i][j];
                mat[i][j]=temp;
            }
        }
        // flip
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat.length/2;j++)
            {
                int temp=mat[i][n-j-1];
                mat[i][n-j-1]=mat[i][j];
                mat[i][j]=temp;
            }
        }
    }

    static boolean checkEqual(int[][] mat, int[][] target)
    {
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j< mat.length;j++)
            {
                if(mat[i][j]!=target[i][j])
                    return false;
            }
        }
        return true;
    }
}