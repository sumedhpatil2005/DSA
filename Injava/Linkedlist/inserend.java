        package Injava.Linkedlist;

        public class inserend {
            
            static class Node{
            int data;

                Node next;
            }
            public static void main(String[] args) {
                Node first = new Node();
                Node second = new Node();
                first.data=10;
                second.data=20;
                first.next=second;
                Node head = first;
                Node NN = new Node();
                NN.data = 40;
                Node temp  = head;
                while(temp.next!=null){ 
                    
                        temp = temp.next;
                }
                 temp.next = NN;

                
                temp = head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }
        }
