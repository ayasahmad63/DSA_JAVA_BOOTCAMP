package com.company;

public class M_07_AddTwoNumbers {
    public static void main(String[] args) {


        class Solution {
            public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



                ListNode head=l1;
                int c=0;
                ListNode prev=null;



                while(l1!=null && l2 !=null ){
                    prev=l1;
                    int n=l1.val+l2.val+c;
                    l1.val=n%10;
                    c=n/10;
                    l1=l1.next;
                    l2=l2.next;


                }
                if(l2!=null){
                    prev.next=l2;
                    prev=prev.next;
                    l1=prev;
                }


                while(l1!=null){
                    prev=l1;
                    int n=l1.val+c;
                    l1.val=n%10;
                    c=n/10;
                    l1=l1.next;
                }




                if(c!=0){
                    ListNode node=new ListNode(c);
                    prev.next=node;
                }



//                return head;
            }
        }


    }
}
