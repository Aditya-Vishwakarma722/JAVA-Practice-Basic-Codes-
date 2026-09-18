/*
Find the Beginning of a Loop :

Suppose:
A → B → C → D → E
        ↑       |
        └───────┘

You already know that a loop exists.
Now determine which node begins the loop.

Output:
C

The Core Mechanics :
Slow Pointer (Tortoise): Starts at the head of the list and advances by 1 node per iteration (slow = slow.next).
Fast Pointer (Hare): Starts at the head of the list and advances by 2 nodes per iteration (fast = fast.next.next).

 */

public class Find_Beginning_of_Loop {
    public static void main(String [] args){
        CNode head = new CNode('A');
        CNode nodeB = new CNode('B');
        CNode nodeC = new CNode('C');
        CNode nodeD = new CNode('D');
        CNode nodeE = new CNode('E');

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeC;

        CNode slow = head;
        CNode fast = head;
        boolean loopExists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        if (loopExists) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println(slow.ch);
        } else {
            System.out.println("Loop Not Found!");
        }
    }
}
