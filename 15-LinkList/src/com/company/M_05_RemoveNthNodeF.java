package com.company;

public class M_05_RemoveNthNodeF {
    public static void main(String[] args) {
        class Solution {
            public ListNode removeNthFromEnd(ListNode head, int n) {

                if(head==null){
                    return head;
                }

                if(head.next!=null && head.next.next==null){
                    if(n==1){
                        head.next=null;
                        return head;
                    }
                    return head.next;

                }

                ListNode slow=head;
                ListNode fast=head;
                int sl=1,fs=1;


                while(fast!=null && fast.next!=null){
                    fast=fast.next.next;
                    slow=slow.next;
                    sl++;
                    fs=fs+2;
                }
                if(fast==null){
                    n--;
                }
                if(fs==n){
                    head=head.next;
                    return head;
                }
                System.out.println(n);
                System.out.println(sl);

                if(sl>n){
                    n=fs-n-sl;
                }else{
                    slow=head;
                    n=fs-n;
                }


                while(n>1){
                    slow=slow.next;
                    n--;
                }
                slow.next=slow.next.next;



                return head;



            }
        }
    }
}

