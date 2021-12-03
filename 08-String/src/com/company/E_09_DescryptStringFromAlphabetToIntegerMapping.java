package com.company;

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

public class E_09_DescryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
          String s="12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
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
        System.out.println(str.toString());





    }
}
