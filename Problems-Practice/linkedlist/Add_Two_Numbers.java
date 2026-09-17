/*
Add Two Numbers :

Numbers are represented backwards:
2 → 4 → 3

represents:
342

and:
5 → 6 → 4

represents:
465
Add them.

Expected:
7 → 0 → 8

because:
342 + 465 = 807
 */

class AdderNumber{
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.num;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.num;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }
}

public class Add_Two_Numbers {
    public static void main(String[] args){
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        AdderNumber adderNumber = new AdderNumber();

        Node ans = adderNumber.addTwoNumbers(head1,head2);
        Node current = ans;
        while (current != null) {
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println(" null ");

    }
}
