package Injava.Linkedlist;

import java.util.*;

public class basicnode {

    static class Node{
        int data;
        Node next;
    }
    public static void main(String[]args){
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node head=first;
        first.data=2;
        second.data = 3;
        third.data = 4;
int count=0;
        first.next = second;
        second.next = third;
        System.out.println(first.data);
        System.out.println(
            first.next.data);

            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                count++;

              temp=  temp.next;
            }
            System.out.println(count);
        

    }
}
