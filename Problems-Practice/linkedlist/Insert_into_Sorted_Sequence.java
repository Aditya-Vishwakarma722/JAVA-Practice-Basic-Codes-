/*
Insert Into a Sorted Sequence :

You have:
10 → 20 → 30 → 40 → 50

Insert:
35 without destroying the sorted order.

Result:
10 → 20 → 30 → 35 → 40 → 50
 */

public class Insert_into_Sorted_Sequence {
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node current = head;
        while(current!= null){
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println("null");

        current = head;
        int data = 35;
        while(current!=null && current.next!=null){
            if(data>current.num && data<current.next.num){
                Node New = new Node(data);
                New.next = current.next;
                current.next = New;
            }
            current = current.next;
        }

        current = head;
        while(current!= null){
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
