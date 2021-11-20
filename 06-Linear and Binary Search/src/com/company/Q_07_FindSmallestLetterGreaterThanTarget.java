package com.company;

public class Q_07_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
          char target='j';
        int start=0;
        int end=letters.length-1;
        int mid=0;

        while(start<=end){
             mid=start +(end-start)/2;

             if((int)letters[mid]-(int)target==0){
                 start=mid+1;
                 break;
             }

            else if((int)letters[mid]-(int)target>0){

                 end=mid-1;
            }
            else if((int)letters[mid]-(int)target<0)
            {
                start=mid+1;

            }

        }

        System.out.println(letters[start%letters.length]);



    }
}
