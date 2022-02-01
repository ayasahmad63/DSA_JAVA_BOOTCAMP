package com.company;

public class M_03_ReverseLinkedList2 {
    public static void main(String[] args) {
        class Solution {
            public ListNode reverseBetween(ListNode head, int left, int right) {
                if(head.next==null || head== null || right==left){
                    return head;
                }


                ListNode prev=null;
                ListNode curr=head;
                for(int i=0;curr!=null && i<left-1;i++){
                    prev=curr;
                    curr=curr.next;
                }

                ListNode last=prev;
                ListNode newEnd=curr;

                ListNode next=curr.next;

                for(int i=0;i<right-left+1;i++){
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                    if(next!=null){
                        next=next.next;
                    }

                }
                if(last!=null){
                    last.next=prev;


                }else{
                    head=prev;
                }
                newEnd.next=curr;







                return head;
            }
        }
    }
}
