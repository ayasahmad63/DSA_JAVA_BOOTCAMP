package com.company;

//https://leetcode.com/problems/add-binary/

public class E_01_AddBinary {
    public static void main(String[] args) {

        String a="11",b="1";

        int n1= a.length()-1;
        int n2=b.length()-1;

        String ans="";

      int n=0;

        while(n1>=0 || n2>=0 || n>0){

            if(n1>=0) {
                n += a.charAt(n1) - '0';
            }

            if(n2>=0){
                n +=b.charAt(n2) - '0';

            }

//            System.out.println(n);

          ans=(char)n%2+ans;

          n=n/2;

          n1--;
          n2--;

        }

        System.out.println(ans);



    }
}
