import java.util.*;

public class M_Q2_SetmatrixZeros{
    public static void main(String[] args) {
         int[][] matrix={
                 {1,1,1},
                 {1,0,1},
                 {1,1,1}



         };

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


       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               System.out.print(" " +matrix[i][j]);
           }
           System.out.println(" ");
       }










    }


}
