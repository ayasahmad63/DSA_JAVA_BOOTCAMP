package com.company;
//https://leetcode.com/problems/avoid-flood-in-the-city/
import java.util.ArrayList;

public class FloodProblem {

    public static void main(String[] args) {

        int[] rains={69,0,0,0,69};


        ArrayList<Integer> duplicate=new ArrayList<>();
        ArrayList<Integer> duplicateindex=new ArrayList<>();
        ArrayList<Integer> duplicateindex2=new ArrayList<>();
        ArrayList<Integer> zeroposition=new ArrayList<>();
//        ArrayList<Integer> zeropositionindex=new ArrayList<>();

        for (int i=0;i<rains.length;i++){
            for(int j=i+1;j<rains.length;j++){
                if(rains[i]==rains[j] && rains[i]!=0){
                    duplicate.add(rains[i]);
                    duplicateindex.add(i);
                    duplicateindex2.add(j);
                }
            }
        }


           for (int i=0;i<rains.length;i++){
            if(rains[i]==0){

               zeroposition.add(i);
                  }
            }

           if(duplicateindex.size()!=0 && zeroposition.size()==0){
               System.out.println("Flood occur");
           }
           else if(duplicateindex.size()>zeroposition.size()){
               System.out.println("Flood occur");
           }

           for(int i=0;i<zeroposition.size();i++){
               rains[zeroposition.get(i)]=1;

           }
           for(int i=0;i<zeroposition.size();i++){
               rains[zeroposition.get(i)]=rains[duplicateindex.get(duplicateindex.size()-i-1)];
//               System.out.println( duplicateindex.get(i));
           }
//        System.out.println(duplicateindex.size());
//        System.out.println(duplicateindex);


        for (int i=0;i<duplicateindex.size();i++){
            rains[duplicateindex.get(i)]=-1;
            rains[duplicateindex2.get(i)]=-1;
        }





        for (int i=0;i<rains.length;i++){
               System.out.print( " " +rains[i]);
           }


    }




}
