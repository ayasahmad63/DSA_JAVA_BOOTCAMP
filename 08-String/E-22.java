//https://leetcode.com/problems/reverse-prefix-of-word/submissions/

class Solution {
    public String reversePrefix(String word, char ch) {

        int index=word.indexOf(ch);
        String rem=word.substring(index+1,word.length());
        StringBuilder res = new StringBuilder();
        for(int i=index;i>=0;i--){
            res.append(word.charAt(i));
        }
        res.append(rem);
        return res.toString();
    }


}
