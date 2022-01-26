package com.company;

public class E_06_PalindromeLinkedList {
    public static void main(String[] args) {

        ListNode node2 =new ListNode();

        node2.insert(1);
        node2.insert(2);
        node2.insert(4);
        ListNode head=node2.head;
        String str="";
        while(head!=null){
            str=str+head.val;
            head=head.next;
        }
        System.out.println(str);
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println(false);
            }
            start++;
            end--;
        }
        System.out.println(true);
    }
}
