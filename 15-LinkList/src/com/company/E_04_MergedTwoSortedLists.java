package com.company;

public class E_04_MergedTwoSortedLists {
    public static void main(String[] args) {

        ListNode node1 =new ListNode();

        node1.insert(1);
        node1.insert(2);
        node1.insert(3);
        ListNode list1=node1.head;

        node1.display();
        ListNode node2 =new ListNode();

        node2.insert(1);
        node2.insert(2);
        node2.insert(4);
        ListNode list2=node2.head;
node2.display();

        ListNode ans=new ListNode();
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode temp3=ans;
        while(list1!=null || list2!=null){

            if(list1.val==list2.val || list1.val<list2.val){
                temp3.next=list1;
                temp1=temp1.next;
                list1.next=list2;
                temp2=temp2.next;
                list2.next=null;
                temp3=list2;
                list1=temp1;
                list2=temp2;

            }else if(list1.val>list2.val){
                temp3.next=list2;
                temp2=temp2.next;
                list2.next=list1;
                temp1=temp1.next;
                list1.next=null;
                temp3=list1;
                list2=temp2;
                list1=temp1;


            }

        }

        if(list1!=null){
            temp3.next=list1;
        }
        if(list2!=null){
            temp3.next=list2;

        }
        ans.display();

    }
}
