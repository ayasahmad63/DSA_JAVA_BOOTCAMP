public class M_Q1_SpiralMedium {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,},
                {5,6,7,},
                {9,10,11}
        };


        int maxr=arr.length;
        int maxc=arr[0].length;
        int num=maxr*maxc;
        int count=0,minr=0,minc=0;

        while(count<num){
            for(int i=minr,j=minc;j<maxc && count<num;j++ ){
                System.out.print(" " +arr[i][j]);
                count++;
            }
            for(int i=minr+1,j=maxc-1;i<maxr && count<num;i++){
                System.out.print(" " +arr[i][j]);
                count++;
            }

            for(int i=maxr-1,j=maxc-2;j>=minc && count<num;j--){
                System.out.print(" " +arr[i][j]);
                count++;
            }

            for(int i=maxr-2,j=minc;i>minr && count<num;i--){
                System.out.print(" " +arr[i][j]);
                count++;
            }
            minc++;
minr++;maxc--;maxr--;


        }

    }
}
