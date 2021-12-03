
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/

class Solution {
    public String freqAlphabets(String s) {

        StringBuilder str=new StringBuilder();

        int i=0;
        while(i<s.length()){
            if(s.length()-i<3){
                String str1=s.substring(i,i+1);
                int num=Integer.parseInt(str1);
                char c=(char)(96+num);
                str.append(c);
                i=i+1;
            }

            else if(s.charAt(i+2)=='#'){
                String str1=s.substring(i,i+2);
                int num=Integer.parseInt(str1);
                char c=(char)(96+num);
                str.append(c);
                i=i+3;
            }else{
                String str1=s.substring(i,i+1);
                int num=Integer.parseInt(str1);
                char c=(char)(96+num);
                str.append(c);
                i=i+1;

            }
        }


        return str.toString();


    }
}