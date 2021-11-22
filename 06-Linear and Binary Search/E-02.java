//https://leetcode.com/problems/guess-number-higher-or-lower/

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int start=1;
        int end=n;

        while(start<=end){
            int  pick=start+(end-start)/2;
            if(guess(pick)==0){
                return pick;
            }
            else if(guess(pick)==1){
                start=pick+1;
            }
            else if(guess(pick)==-1){
                end=pick-1;
            }



        }
        return -1;


    }
}