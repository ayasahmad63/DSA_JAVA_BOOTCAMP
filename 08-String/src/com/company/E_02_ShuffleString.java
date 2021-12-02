package com.company;

public class E_02_ShuffleString {
    public static void main(String[] args) {

       String  s = "codeleet";
       int[] indices = {4,5,6,7,0,2,1,3};

        StringBuilder ans= new StringBuilder(s);
        int i=0;
        while(i<indices.length){
            if(indices[i]!=i){

                // Swapping in string
                char st=ans.charAt(indices[i]);
                ans.setCharAt(indices[i],ans.charAt(i));
                ans.setCharAt(i,st);



                // Swapping in indices Array
                int temp=indices[i];
                indices[i]=indices[indices[i]];
                indices[temp]=temp;

            }
            else{
                i++;
            }
        }
        System.out.println(ans.toString());
    }
}
