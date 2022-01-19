package com.company;

public class DecodeString {
    public static void main(String[] args) {
     String str="2[abc]3[cd]ef";
        System.out.println(decode(str,""));

    }

    static String decode(String str,String ans){
        if(str.isEmpty()){
            return ans;
        }

        char ch=str.charAt(0);
//        System.out.println(ch);
        int n=ch-'0';
        if(n<47){
            int temp=2;
            while(str.charAt(temp)!=']'){
                if(str.charAt(temp)!='['){
                    int p=str.charAt(temp-1)-'0';
                    while(str.charAt(temp)!=']'){
                        p++;
                    }
                    str=str.substring(0,temp+1)+str.substring()
                }
                temp++;
            }

            String   temps=str.substring(2,temp);
//            System.out.println(temps);
            for(int i=0;i<n;i++){
                ans=ans+temps;
            }

            return decode(str.substring(temp+1),ans);
        }
        else{
            return  decode(str.substring(1),ans+ch);
        }
    }

}
