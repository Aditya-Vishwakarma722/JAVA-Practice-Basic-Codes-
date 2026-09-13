/*
Remove Consecutive Duplicates :

Given:
1 → 1 → 2 → 2 → 2 → 3 → 4 → 4

produce:
1 → 2 → 3 → 4

But:
1 → 2 → 1 → 2

 */

public class Remove_Consecutive_Duplicates_LL {
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(4);

        Node current = head;
        while(current!=null){
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println("null");

        current = head;
        while(current!=null && current.next!=null){
            if(current.num == current.next.num){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }

        current = head;
        while(current!=null){
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
