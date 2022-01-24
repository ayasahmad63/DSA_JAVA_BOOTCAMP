package com.company;

import org.w3c.dom.Node;

public class ListNode {
    ListNode head;
    int val;
    ListNode next;

    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }

    public void insert(int value){
        ListNode node=new ListNode(value);
        if(head==null){
            head=node;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

    }

    public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public ListNode heads(){
        return head;
    }


}
