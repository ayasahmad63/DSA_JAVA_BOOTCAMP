package com.company;

public class Pattern {
    public static void main(String[] args) {

   String s="Let's take LeetCode contest";
        System.out.println(s);
        StringBuilder ans=new StringBuilder();

        int i=0;
        while(i<s.length()){

            int j=i;
            while(s.charAt(j)!=' ' && j<s.length()-1){
                j++;

            }
            System.out.println(j);
            int temp=j;

            while(j>=i){

                if(s.charAt(j)!=' '){
                ans.append(s.charAt(j));}
                j--;
            }
            ans.append(' ');
            System.out.println(ans.toString());
            i=temp+1;
        }



        ans.delete(ans.length()-1,ans.length());
//        return ans.toString();
        System.out.println(ans.toString());


        
    }
}
