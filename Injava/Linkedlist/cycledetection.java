    package Injava.Linkedlist;

    public class cycledetection {
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
            Node seven = new Node();
            Node head=one;
            one.data = 10;
            two.data = 20;
            three.data=30;
            four.data=40;
            five.data=50;
            six.data = 60;
            seven.data=70;
            
            one.next=two;
            two.next=three;
            three.next=four;
            four.next=six;
            five.next=four;
            six.next=five;
            Node fast = one;
            Node slow = one;
             
           while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                System.out.println("circular loop");
                return;
            }
           }
           System.out.println("no circular loop");
        

            

        }
    }
