package com.company;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class E_06_CheckIfTwoStringsAreEquivalent {
    public static void main(String[] args) {
        String[] word1={"a","c"};
        String[] word2={"a","bc"};

        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();


        for(int i=0; i< word1.length;i++){
            str1=str1.append(word1[i]);
        }
        for(int i=0; i< word2.length;i++){
            str2=str2.append(word2[i]);
        }
//        System.out.println(str1.toString());
//        System.out.println(str2.toString());
        if(str1.toString().equals(str2.toString())){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
