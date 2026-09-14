/*
Find Whether the Sequence Loops :

You are given:
A → B → C → D → E
        ↑       |
        └───────┘

Eventually, following the sequence takes you back to C.

Determine whether such a loop exists.
 */

public class Find_Whether_the_Sequence_Loops {
    public static void main(String[] args){
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

        CNode tortoise = head;
        CNode hare = head;
        boolean loopExists = false;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                loopExists = true;
                break;
            }
        }

        if (!loopExists) {
            System.out.println("Loop Not Found!");;
        }
        else{
            System.out.println("Loop Found!");
        }
    }
}
