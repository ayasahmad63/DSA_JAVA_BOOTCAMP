package com.company;

import java.util.ArrayList;
import java.util.List;

public class M_01_CombinationSum {
    public static void main(String[] args) {

        int[] candidates={2,3,5};
        int target=8;
        List<List<Integer>> answer=new ArrayList<>();
       Combiantion(0,candidates,7,new ArrayList(),answer);

//        System.out.println(ans);
        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }

    }
    static void Combiantion(int start,int[] candidates,int target,List<Integer> arrr,List<List<Integer>> answer){

        if(target==0){
            answer.add(new ArrayList(arrr));
            return ;

        }
       if(target<0){

           return ;
       }

       for(int i=start;i<candidates.length;i++) {
           arrr.add(candidates[i]);
           Combiantion(i,candidates, target-candidates[i],arrr,answer);
           arrr.remove(arrr.size()-1);

          }
    }



}
