package com.company;

import java.util.Locale;

public class E_16_ValidPalindrome {
    public static void main(String[] args) {
        String s="cac";
        System.out.println(s);
//        s.toLowerCase();
        System.out.println(s);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(((int)c>=65 &&(int)c<= 90) || (int)c>=97 &&(int)c<= 122){
                str.append(c);
            }
        }
         s=str.toString().toLowerCase();
        System.out.println(s);

        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                System.out.println(false);

            }else{
               start++;
                end--;
            }
        }
    }
}
