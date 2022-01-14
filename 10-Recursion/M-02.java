https://leetcode.com/problems/word-search/submissions/

class Solution {

    int[] r={-1,0,1,0};
    int[] c={0,-1,0,1};
    public boolean exist(char[][] board, String word) {


        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]!=word.charAt(0)) continue;
                boolean res=soluti(board,word,0,i,j);
                if(res) return res;


            }

        }
        return false;
    }

    public  boolean   soluti(char[][] ch,String words,int i,int n,int m)
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