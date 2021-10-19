import java.util.Arrays;

public class Q_19_MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs={{1993,1999},{2000,2010}};
        int ans=maximumPopulation(logs);
        System.out.println(ans);
    }

//              BRUTE-FORCE  METHOD
//                       Time Complexity=O(n(square)) :   Space Complexity=O(1);

//
//    static int maximumPopulation(int[][] logs){
//          int maxArr[]=new int[102];
//
//          for (int i=0;i<logs.length;i++) {
//              for (int j = logs[i][0]; j < logs[i][1]; j++) {
//                       maxArr[j-1950]++;
//
//              }
//          }
//
//          int maxvalue=maxArr[0],maxyear=1950;
//             for(int i=0;i<102;i++){
//                 if(maxArr[i]>maxvalue){
//                     maxvalue=maxArr[i];
//                     maxyear=i+1950;
//
//                 }
//             }
//
//           return maxyear;
//        }






//        Concise Method
//                 Time Complexity=O(n): Space Comlexity=O(1);



    static  int maximumPopulation(int[][] logs){
        int maxArr[]=new int[102];
        for (int i=0;i<logs.length;i++){
            maxArr[logs[i][0]-1950]++;
            maxArr[logs[i][1]-1950]--;
        }
        for(int i=1;i<101;i++){
            maxArr[i]+=maxArr[i-1];
        }
        int maxvalue=maxArr[0],maxyear=1950;
        for(int i=0;i<102;i++){
            if(maxArr[i]>maxvalue){
                maxvalue=maxArr[i];
                maxyear=i+1950;
            }
        }
        return maxyear;
    }




}
