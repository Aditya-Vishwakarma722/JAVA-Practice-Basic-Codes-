/*
Remove the Nth Element From the End :
Given:

1 → 2 → 3 → 4 → 5
remove the 2nd element from the end.

Result:
1 → 2 → 3 → 5
 */

public class Remove_Nth_Element_From_End {
    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node current = head;
        Node nextNode = head.next;
        int total = 0;
        while(current!=null){
            System.out.print(current.num+" -> ");
            total++;
            current = current.next;
        }
        System.out.println("null | Total elements : "+total);

        int num = 2;
        int pos = (total - num) + 1;
        current = head;

        for(int i=1; i<pos-1;i++){
            current = current.next;
        }
        current.next = current.next.next;

        current = head;
        while(current!=null){
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
