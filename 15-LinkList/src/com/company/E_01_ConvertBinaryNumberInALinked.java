package com.company;

public class E_01_ConvertBinaryNumberInALinked {
    public static void main(String[] args) {
        ListNode node =new ListNode();

        node.insert(0);
        node.insert(0);
        node.insert(0);
//        node.insert(1);
//        node.insert(0);
//        node.insert(0);
//        node.insert(1);
//        node.insert(1);
//        node.insert(1);
//        node.insert(0);
//        node.insert(0);
//        node.insert(0);
//        node.insert(0);
//        node.insert(0);
//        node.insert(0);


        ListNode head=node.head;
//        node.display();
//        System.out.println(head.val);
        System.out.println(head.val);

        int n=0;
        ListNode temp=head;
       while(temp.next!=null){
           n++;
           temp=temp.next;
       }
        System.out.println(n);
        int sum=0;
       while(head!=null){
           sum+=head.val*Math.pow(2,n--);
           head=head.next;
       }
        System.out.println(sum);
//        int p=1;



//        while(head!=null)
//        {
//            sum+=(head.val)*p;
//            p=p*10;
//            if(head.next==null && head.val==0){
//                sum+=p;
//            }
//            head=head.next;
//        }

//        sum+=(head.val)*p;
//        int ans=0;
//        p=1;
//        System.out.println(sum);
//        while(sum!=0){
//            ans+=(sum &1)*p;
//            p=p*2;
//            sum=sum/10;

//       };
//        System.out.println(ans);



    }
}
