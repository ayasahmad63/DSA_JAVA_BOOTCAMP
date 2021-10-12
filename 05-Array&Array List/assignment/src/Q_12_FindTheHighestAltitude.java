public class Q_12_FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain={-4,-3,-2,-1,4,3,2};
        int ans =largestAltitude(gain);
        System.out.println(ans);
    }

    static int largestAltitude(int[] gain){
        int max=0,temp=0;

        for(int i=0;i<gain.length;i++){
            temp+=gain[i];
            if(temp>max){
                max=temp;
            }

        }


        return max;
    }




}
