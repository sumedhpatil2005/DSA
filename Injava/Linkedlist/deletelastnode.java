package Injava.Linkedlist;

public class deletelastnode {

   static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args ){
        Node one = new Node();
        Node two = new Node();
        Node three = new Node(); 

        one.data=10;
        two.data=20;
        three.data=30;
        Node head = one;
        one.next=two;
        two.next=three;
        Node temp=head;
        while(temp!=null){
            if(temp.next.next==null){
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }

    }
}
