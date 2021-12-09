package com.company;

//https://leetcode.com/problems/reverse-prefix-of-word/submissions/

public class E_22_ReversePrefixOfWord {
    public static void main(String[] args) {
//        String word="rzwuktxcjfpamlonbgyieqdvhs" ;
        char ch='s';
        String word="abcd";
//
//
//        StringBuilder s=new StringBuilder(word);
//
//        int i=0;
//        while(word.charAt(i)!=ch && i<word.length()-1){
//            i++;
//        }
//
//        if(i<word.length()){
//            int start=0;
//            int end=i;
//            while(start<end){
//                s.setCharAt(start,word.charAt(end));
//                s.setCharAt(end,word.charAt(start));
//                start++;
//                end--;
//            }
//
//            for(int k=i+1;k<word.length();k++){
//                s.setCharAt(k,word.charAt(k));
//            }
//
//        }
//
//
//        System.out.println(s.toString());



        int index=word.indexOf(ch);
        String rem=word.substring(index+1,word.length());
        StringBuilder res = new StringBuilder();
        for(int i=index;i>=0;i--){
            res.append(word.charAt(i));
        }
        res.append(rem);
        System.out.println( res.toString());

    }
}
