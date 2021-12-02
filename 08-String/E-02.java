//https://leetcode.com/problems/shuffle-string/

class Solution {
    public String restoreString(String s, int[] indices) {
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
        return ans.toString();
    }
}
