package com.company;

//https://leetcode.com/problems/defanging-an-ip-address/

public class E_01_DefangingAnIpAddress {
    public static void main(String[] args) {
        String address="1.1.1.1";


        String ans="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ans=ans+"[.]";
            }else{
                ans=ans+address.charAt(i);
            }
        }

        System.out.println(ans);

    }
}
