/*
Two Sorted Chains :

You have two sequences:
A: 1 → 4 → 7 → 10
B: 2 → 3 → 8 → 9

Combine them into one sorted sequence:
1 → 2 → 3 → 4 → 7 → 8 → 9 → 10
 */

import java.util.List;

public class Two_Sorted_Chains {
    public static void main(String [] args){
        Node head1 = new Node(1);
        head1.next = new Node(4);
        head1.next.next = new Node(7);
        head1.next.next.next = new Node(10);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(9);

        Node current1 = head1;
        Node current2 = head2;

        System.out.print("List 1 :- ");
        while(current1!=null){
            System.out.print(current1.num+" -> ");
            current1 = current1.next;
        }
        System.out.println("null");
        current1 = head1;

        System.out.print("List 2 :- ");
        while(current2!=null){
            System.out.print(current2.num+" -> ");
            current2 = current2.next;
        }
        System.out.println("null");
        current2 = head2;

        Node newNode = new Node(0);
        Node tail = newNode;

        while(current1!=null && current2!=null){
            if(current1.num < current2.num){
                tail.next = current1;
                current1 = current1.next;
            }
            else if(current2.num < current1.num){
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }

        if(current1 != null) {
            tail.next = current1;
        } else {
            tail.next = current2;
        }

        Node dummy = newNode.next;
        while(dummy!=null){
            System.out.print(dummy.num+" -> ");
            dummy = dummy.next;
        }
        System.out.println(" null ");

    }
}
