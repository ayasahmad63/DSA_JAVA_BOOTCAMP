import java.util.ArrayList;
import java.util.List;

public class Q_23_LuckyNumberInaMatrix {
    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans=luckyNumber(matrix);
        System.out.println(ans);

    }

    static List<Integer> luckyNumber(int[][] matrix){
        ArrayList<Integer> ans =new ArrayList<Integer>();
        int i,j;
         for( i=0;i<matrix.length;i++){
             int min=matrix[i][0];

             for(j=0;j<2;j++){
                 if(matrix[i][j]<min){
                     min=matrix[i][j];
                 }
             }
             if(maxCoul(matrix,min,j)){
                 ans.add(matrix[i][j]);
             }

         }
         return  ans;
    }
    static boolean maxCoul(int[][] matrix, int min,int j){

        for(int k=0;k<matrix[j].length;k++){
            if(matrix[k][j]>min){
                return false;

            }
        }



        return true;
    }



}
