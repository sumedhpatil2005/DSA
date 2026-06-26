package Injava.Linkedlist;

public class searchnode {
    
   static class Node{
    int data;
    Node next;
   }
 
public static void main(String[] args) {
    
   Node first = new Node();
   Node second = new Node();
   Node third = new Node();
   Node fourth = new Node();
   Node head = first;
   first.data = 10;
   second.data  = 20;
   third.data = 30;
   fourth.data = 40;
    int target = 30;
   first.next = second;
   second.next=third;
   third.next=fourth;
    Node temp = head;
   while(temp != null){
    if(temp.data==target){
         System.out.println(temp.data);
        return;

    }
    else{
        temp = temp.next;
    }
   
   }

}

}
