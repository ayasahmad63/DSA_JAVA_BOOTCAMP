
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end=letters.length-1;
        int mid=0;

        while(start<=end){
             mid=start +(end-start)/2;


            if((int)letters[mid]-(int)target>0)             {

                 end=mid-1;
            }
            else
            {
                start=mid+1;

            }

        }
        return letters[start%letters.length];

    }
}