package com.company;

//https://leetcode.com/problems/goal-parser-interpretation/submissions/

public class E_03_GoalParserInterpretation {
    public static void main(String[] args) {
      String command= "G()(al)";

        StringBuilder ans=new StringBuilder();

        int i=0;
        while(i<command.length()){
            if(command.charAt(i)=='(' && command.charAt(i+1) == ')'){
                ans.append('o');
                i=i+2;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1) == 'a'){
                ans.append('a');
                ans.append('l');
                i=i+4;
            }
            else{
                ans.append(command.charAt(i));
                i++;
            }




        }
        System.out.println(ans.toString());

    }
}
