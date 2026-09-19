/*
Rotate the Sequence :

Given:
1 → 2 → 3 → 4 → 5
rotate it right by 2.

Result:
4 → 5 → 1 → 2 → 3
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Rotate_the_Sequence {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode oldTail = head;
        int length = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        oldTail.next = head;

        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Rotate_the_Sequence solver = new Rotate_the_Sequence();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ListNode rotatedHead = solver.rotateRight(head, 2);

        System.out.print("Rotated List (k=2): ");
        printList(rotatedHead);
    }
}
