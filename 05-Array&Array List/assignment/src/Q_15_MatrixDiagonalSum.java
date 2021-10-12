public class Q_15_MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum=diagonalSum(mat);
        System.out.println(sum);
    }
    static int diagonalSum(int[][] mat){
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j||i+j==n-1){
                    sum+=mat[i][j];
                    System.out.println(i+" "+j);
                }
            }
        }

        return sum;

    }
}
