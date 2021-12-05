package com.company;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/

public class E_12_ReverseWordInAString3 {
    public static void main(String[] args) {

        String s="Let's take LeetCode contest";
        StringBuilder ans=new StringBuilder();

        int i=0;
        while(i<s.length()){

            int j=i;
            while(s.charAt(j)!=' ' && j<s.length()-1){
                j++;

            }
            int temp=j;

            while(j>=i){
                if(s.charAt(j)!=' '){
                    ans.append(s.charAt(j));}
                j--;
            }
            ans.append(' ');
            i=temp+1;
        }


        ans.delete(ans.length()-1,ans.length());


        System.out.println(ans.toString());


    }
}
