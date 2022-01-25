package com.company;

public class E_03_MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode node =new ListNode();

        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);

        ListNode head=node.head;
        node.display();
        ListNode temp=head;
        int n=0;

        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n%2==1){
            n=(n+1)/2;
        }else{
            n=n/2+1;
        }


        for(int i=0;i<n-1;i++){
            head=head.next;


        }

        System.out.println(head.val);


    }

}
