package Injava.Linkedlist;

public class middle {
    
    static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args){
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();   

        first.data = 10;
        second.data=20;
        third.data=30;
        fourth.data=40;
        fifth.data=60;
        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        Node temp=head;
        Node fast = new Node();
        Node slow = new Node();
        fast = temp;
        slow = temp;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;


            
        }
        System.out.println(slow.data+"is the middle node ");

    
    }
}
