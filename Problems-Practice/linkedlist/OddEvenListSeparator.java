/*
Separate Odd and Even Positions :

Given:
1 → 2 → 3 → 4 → 5 → 6
rearrange the sequence so that nodes at odd positions come first, followed by nodes at even positions:

Output :
1 → 3 → 5 → 2 → 4 → 6
 */

public class OddEvenListSeparator {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
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
        OddEvenListSeparator separator = new OddEvenListSeparator();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        ListNode rearrangedHead = separator.oddEvenList(head);

        System.out.print("Rearranged List: ");
        printList(rearrangedHead);
    }
}

