class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] maxArr=new int[102];
        for(int i=0;i<logs.length;i++){
            maxArr[logs[i][0]-1950]++;
            maxArr[logs[i][1]-1950]--;
        }
        for(int i=1;i<102;i++){
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