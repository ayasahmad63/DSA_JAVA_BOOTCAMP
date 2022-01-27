package com.company;

public class E_11_RemoveLinkedListElements {
    public static void main(String[] args) {

        ListNode node2 =new ListNode();

        node2.insert(1);
        node2.insert(2);
        node2.insert(4);
        ListNode head=node2.head;
        int val=6;

        if(head==null){
//            return head;
        }
        if(head.next==null){
            if(head.val==val ){
//                return null;
            }else{
//                return head;
            }
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.next==null && temp.next.val==val){
                temp.next=null;
                break;
            }
            if(temp.next.val==val){

                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }



        }
        if(head.val==val){
            head=head.next;
        }
//        return head;






    }
}
