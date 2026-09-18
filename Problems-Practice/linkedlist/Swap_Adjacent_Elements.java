/*
Swap Adjacent Elements :

Given:
1 → 2 → 3 → 4 → 5 → 6

produce:
2 → 1 → 4 → 3 → 6 → 5
 */

public class Swap_Adjacent_Elements {
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node current = head;
        while(current!=null){
            System.out.print("|"+current.num+"| -> ");
            current = current.next;
        }
        System.out.println("|null|");

        Node prev = null;
        current = head;
        while(current!=null && current.next!=null){
            Node first = current;
            Node second = current.next;

            first.next = second.next;
            second.next = first;

            if (prev == null) {
                head = second;
            } else {
                prev.next = second;
            }

            prev = first;
            current = first.next;
        }

        current = head;
        while(current!=null){
            System.out.print("|"+current.num+"| -> ");
            current = current.next;
        }
        System.out.println("|null|");

    }
}
