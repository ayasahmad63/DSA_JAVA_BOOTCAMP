package com.company;

public class M_04_ReorderList {
    public static void main(String[] args) {

        class Solution {
            public void reorderList(ListNode head) {


                if(head==null || head.next==null){
                    return ;
                }

                ListNode temp=head;
                while(temp.next!= null){
                    ListNode prev=null;
                    ListNode curr=temp.next;
                    ListNode next=temp.next.next;


                    while(next!=null){
                        curr.next=prev;
                        prev=curr;
                        curr=next;
                        next=next.next;
                    }
                    curr.next=prev;
                    temp.next=curr;
                    temp=temp.next;


                }


            }
        }

    }
}
