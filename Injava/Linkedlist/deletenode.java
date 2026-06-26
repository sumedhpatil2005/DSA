package Injava.Linkedlist;

public class deletenode {
    static class Node{
        int data;
        Node next;

    }
    public static void main(String[] args){
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();

        one.data = 10;
        two.data=20;
        three.data=30;
        four.data=40;
        Node head=one;
       
        one.next=two;
        two.next=three;
        three.next=four;
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        temp=head;
        while(temp.next!=null){
            if(temp.next.data==30){
                temp.next=temp.next.next;
                break;

            }
            temp = temp.next;
        }
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
}
