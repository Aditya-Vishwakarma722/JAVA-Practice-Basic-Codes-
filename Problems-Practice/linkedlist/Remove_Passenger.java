/*
Remove a Passenger :
A queue of passengers is represented as:
A → B → C → D → E // 1 -> 2 -> 3 -> 4 -> 5

Passenger C cancels their journey.

Remove that passenger while keeping everyone else in the same order.
A → B → D → E // 1 -> 2 -> 4 -> 5
 */

class CNode{
    char ch;
    CNode next;

    CNode(char ch){
        this.ch = ch;
        this.next = null;
    }
}

public class Remove_Passenger {
    public static void main(String [] args){
        CNode head = new CNode('A');
        head.next = new CNode('B');
        head.next.next = new CNode('C');
        head.next.next.next = new CNode('D');
        head.next.next.next.next = new CNode('E');

        char not = 'C';
        CNode current = head;

        while(current!=null){
            System.out.print(current.ch+" ");
            current = current.next;
        }
        System.out.println();

        current = head;
        while(current!=null && current.next!=null){
            if(current.next.ch == not){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        current = head;
        while(current!=null){
            System.out.print(current.ch+" ");
            current = current.next;
        }

    }
}
