package com.company;

public class E_09_RemoveDuplicateFromSortedList {
    public static void main(String[] args) {

        ListNode node2 =new ListNode();

        node2.insert(1);
        node2.insert(2);
        node2.insert(4);
        ListNode head=node2.head;

        if(head==null){
//            return head;
            System.out.println("fdj");
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
//        return head;
        System.out.println("fhdjas");
    }
}
