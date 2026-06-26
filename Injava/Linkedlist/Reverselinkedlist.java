package Injava.Linkedlist;

public class Reverselinkedlist {

    static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args) {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
         
        one.data=10;
        two.data=20;
        three.data=30;
        four.data=40;
        five.data=50;

        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
         Node head=one;
       Node next =null;
       Node current = head;
       Node prev = null;

       while(current!=null){

        next = current.next;
        current.next = prev;
        prev = current;

        current = next;


        


       }
       head = prev;
       Node temp = head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
      

      
    }
    
}
