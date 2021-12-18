package com.company;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class E_12_BinaryGap {
    public static void main(String[] args) {

int n=12;

        int n1=0,n2=0;

        int count=0,max=0,count2=0;
        while(n!=0){

            if(count-n2>max){
             max=count-n2;
            }
            n1=count;
//            System.out.println(n1);
//
            n=n>>1;
            count++;
            count2++;


        }


        if(count2==1){
            System.out.println(0);
        }


        System.out.println(max);


    }
}
