package com.company;

public class E_02_ReverseALinkdList {
    public static void main(String[] args) {

        ListNode node =new ListNode();

        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);
        ListNode head=node.head;
        node.display();

        if(head ==null || head.next==null){
            node.display();
        }
        else if((head.next).next==null){
            (head.next).next=head;
            head=head.next;
            (head.next).next=null;
            node.display();
        }
        ListNode start=head;
        ListNode mid=head.next;
        ListNode end=(head.next).next;
        start.next=null;
        while(end.next!=null){
            mid.next=start;
            start=mid;
            mid=end;
            end=end.next;
        }
        mid.next=start;
        end.next=mid;
        head=end;
        node.display();
    }
}
