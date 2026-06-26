package Injava.Linkedlist;

public class addinbetween {

   static class Tode{
        int data;
        Tode next;

    }
    public static void main(String[] args){
        Tode one = new Tode();
        Tode two = new Tode();
        Tode three = new Tode();
        Tode four = new Tode();

        one.data = 10;
        two.data=20;
        three.data = 30;
        four.data = 40;
        Tode head = one;
        one.next = two;
        two.next=three;
        three.next = four;
        Tode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
         Tode newnode = new Tode();
         newnode.data =35;
         temp=head;
         while(temp!=null){
            if(temp.data==30){
                newnode.next=temp.next;
                temp.next = newnode;
            }
            temp=temp.next;
         }
          temp=head;
         while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
         }


    }
    
}
