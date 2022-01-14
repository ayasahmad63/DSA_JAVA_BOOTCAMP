package com.company;

public class M_02_WordSearch {

  static   int[] r={-1,0,1,0};
  static  int[] c={0,-1,0,1};

    public static void main(String[] args) {

        char[][] ch = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},


        };
        String words = "ABCB";


        int n=ch.length;
        int m=ch[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j]!=words.charAt(0)) continue;
                boolean res=soluti(ch,words,0,i,j);
                if(res) System.out.println(res);;



            }
        }
        System.out.println(false);
    }




  public static  boolean   soluti(char[][] ch,String words,int i,int n,int m)
    {

        if(i==words.length()) return true;

        if(n<0 || m<0 || n>=ch.length || m>=ch[0].length) return false;

        if(words.charAt(i)!=ch[n][m]) return  false;
        char ce=ch[n][m];
        ch[n][m]='@';

        for(int d=0;d<4;d++){
            boolean res=soluti(ch,words,i+1,n+r[d],m+c[d]);

            if(res){
                ch[n][m]=ce;
                return true;
            }

        }
        ch[n][m]=ce;
        return false;
    }



}












































//
//    static int word(char[][] word,String str,int ans,int i,int row,int col ){
//
//        if(str.length()-1 == ans){
//            return 1;
//        }
//      if(col==word[0].length && row!=word.length){
//          word(word,str,ans,i,row+1,0);
//        }
//           if(col==word[0].length && row==word.length){
//         return 0;
//        }
//
//
//      int anss=0;
//      if(i<str.length()&&str.charAt(i)==word[row][col]){
//             ans++;
//             char chh=word[row][col];
//             word[row][col]='@';
//         if(i<str.length()-1 && row>0&&str.charAt(i+1)==word[row-1][col]){
//             anss+=word(word,str,ans,i+1,row-1,col);
//         }
//         if(i<str.length()-1 && row<word[0].length-1&&str.charAt(i+1)==word[row+1][col]){
//               anss+=word(word,str,ans,i+1,row+1,col);
//          }
//         if(i<str.length()-1 && col>0&&str.charAt(i+1)==word[row][col-1]){
//              anss+= word(word,str,ans,i+1,row,col-1);
//          }
//          if(i<str.length()-1 && col<word[row].length-1&&str.charAt(i+1)==word[row][col+1]){
//              anss+= word(word,str,ans,i+1,row,col+1);
//          }
//
//             ans--;
//            word[row][col]=chh;
//      }
//     return anss+ word(word,str,ans,i,row,col+1);
//
//    }



