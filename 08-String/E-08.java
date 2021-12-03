//https://leetcode.com/problems/determine-if-string-halves-are-alike/


class Solution {
    public boolean halvesAreAlike(String s) {
        String str=s.toLowerCase();
        int countfirst=0,countsecond=0;

        for(int i=0;i<str.length()/2;i++){
            char first=str.charAt(i);
            char second=str.charAt(str.length()-i-1);

            if(first=='a' || first =='e' || first=='i' || first =='o' || first =='u'){
                countfirst++;
            }

            if(second =='a' || second =='e' || second =='i' || second =='o' || second =='u'){
                countsecond++;
            }

        }
        if(countfirst==countsecond){
            return true;
        }
        else{
            return false;
        }

    }
}