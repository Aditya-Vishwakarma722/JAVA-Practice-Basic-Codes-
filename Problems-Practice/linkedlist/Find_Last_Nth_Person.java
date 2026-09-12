/*
Find the Last Nth Person :

Given:
10 → 20 → 30 → 40 → 50
find the 2nd person from the end.

Output:
40

Then try:
3rd from end → 30
1st from end → 50
 */

public class Find_Last_Nth_Person {
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node current = head;
        int total =0;
        while(current!=null){
            System.out.print(current.num+" -> ");
            current = current.next;
            total++;
        }
        System.out.println("null");
        System.out.println("Total : "+total);

        current = head;

        int position = 3;
        int shift = (total-position)+1;
        int pos = 1;
        while(current!=null && pos<=shift){
            if(pos==shift){
                System.out.println(current.num);
                break;
            }
            pos++;
            current = current.next;
        }
    }
}
