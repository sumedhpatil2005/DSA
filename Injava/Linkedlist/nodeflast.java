package Injava.Linkedlist;

public class nodeflast {
    static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args){
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
        Node six = new Node();

        one.data=10;
        two.data=20;
        three.data=30;
        four.data=40;
        five.data=50;
        six.data=60;
        Node head=one;
        int n=2;
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;

        Node fast=head;
        Node slow=head;
        for(int i =0;i<n;i++){
                fast=fast.next;
            }

        while(fast.next!=null){
            
                fast=fast.next;
            
            slow = slow.next;
            


        }
        System.out.println(slow.next.data+"this is the second last node");

    }
    
}
