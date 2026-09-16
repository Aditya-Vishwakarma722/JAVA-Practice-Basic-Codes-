
/*
Rearrange the Sequence :

Given:
1 → 2 → 3 → 4 → 5

rearrange it into:
1 → 5 → 2 → 4 → 3

For:
1 → 2 → 3 → 4

produce:
1 → 4 → 2 → 3
 */

public class Rearrange_the_Sequence {

    static class Node {
        int num;
        Node next;

        Node(int num) {
            this.num = num;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node current = head;
        int total = 0;

        while (current != null) {
            System.out.print(current.num + " -> ");
            current = current.next;
            total++;
        }

        System.out.println("null");
        System.out.println("Total Elements :- " + total);

        int mid = (total / 2) + 1;

        Node tempBack = head;
        current = head.next;
        Node tempFront = head.next.next;

        for (int i = 1; i < mid - 1; i++) {
            tempBack = tempBack.next;
            current = current.next;
            tempFront = tempFront.next;
        }

        /*
             For 1 -> 2 -> 3 -> 4 -> 5

             tempBack  = 2
             current   = 3
             tempFront = 4

             Break:
             1 -> 2 -> 3
             4 -> 5
        */

        // Break the list
        tempBack.next = null;

        /*
             Reverse second half

             4 -> 5
             becomes
             5 -> 4
        */

        Node prev = null;
        Node second = tempFront;

        while (second != null) {
            Node next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        /*
             First half:
             1 -> 2 -> 3

             Reversed second half:
             5 -> 4
        */

        Node first = head;
        second = prev;

        // Merge alternately
        while (second != null) {

            Node firstNext = first.next;
            Node secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }

        // Print rearranged list
        System.out.println("Rearranged Sequence:");

        current = head;

        while (current != null) {
            System.out.print(current.num + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}