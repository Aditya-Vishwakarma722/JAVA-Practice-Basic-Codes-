/*
Delete the Middle :

Given:
1 → 2 → 3 → 4 → 5

remove the middle:
1 → 2 → 4 → 5

For:
1 → 2 → 3 → 4 → 5 → 6

remove the second middle:
1 → 2 → 3 → 5 → 6
 */

public class Delete_Middle {
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node current = head;
        int count = 0;
        while(current!= null){
            System.out.print(current.num+" -> ");
            current = current.next;
            count++;
        }
        System.out.println("null");
        System.out.println(count);

        current = head;
        int middle = 0;
        if(count%2 == 0){
            middle = (count/2)+1;
        }else{
            middle = (count+1)/2;
        }

        for(int i = 1; i < middle - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }

        current = head;
        while(current!= null){
            System.out.print(current.num+" -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
