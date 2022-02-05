package com.company;

public class M_06_SwappingNodesInALinkedList {
    public static void main(String[] args) {

        class Solution {
            public ListNode swapNodes(ListNode head, int k) {

                ListNode sl=head;
                ListNode fs=head;
                ListNode temp=head;

                for(int i=0;i<k;i++){
                    temp=fs;
                    fs=fs.next;

                }


                while(fs!=null){
                    sl=sl.next;
                    fs=fs.next;
                }

                int n=sl.val;
                sl.val=temp.val;
                temp.val=n;

                return head;
            }
        }


        
    }
}
