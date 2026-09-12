/*

Reverse the Line :

People are standing:
A → B → C → D → E

Reverse their order:
E → D → C → B → A
 */

public class Reverse_the_Line {
    public static void main(String [] args){
        CNode head = new CNode('A');
        head.next = new CNode('B');
        head.next.next = new CNode('C');
        head.next.next.next = new CNode('D');
        head.next.next.next.next = new CNode('E');

        CNode current = head;
        CNode previous = null;
        CNode nextNode = null;

        while (current!=null){
            System.out.print(current.ch+" -> ");
            current = current.next;
        }
        System.out.println("null");

        current = head;
        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        while (previous!=null){
            System.out.print(previous.ch+" -> ");
            previous = previous.next;
        }
        System.out.println("null");

    }
}
