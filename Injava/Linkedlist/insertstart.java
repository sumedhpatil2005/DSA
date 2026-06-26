package Injava.Linkedlist;

public class insertstart {
    static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args){
        Node first  = new Node();
        Node second = new Node();
        first.data= 10;
        second.data=20;
        first.next=second;
       Node NN  = new Node();
        Node head = NN;

        
        NN.next = first;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}
