/*
Move the Last Element to the Front :

Given:
10 → 20 → 30 → 40 → 50

produce:
50 → 10 → 20 → 30 → 40

 */
public class Move_Last_Element_to_Front {
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.print("Original List: ");
        printList(head);

        head = moveLastToFrontRecursive(head);

        System.out.print("Modified List: ");
        printList(head);
    }

    public static Node moveLastToFrontRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        return rearrange(head, null, head);
    }

    private static Node rearrange(Node head, Node prev, Node current) {
        if (current.next == null) {
            current.next = head;
            prev.next = null;
            return current;
        }
        return rearrange(head, current, current.next);
    }

    public static void printList(Node head) {
        Node current = head;
        while(current != null){
            System.out.print(current.num + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
