/*
Find Where Two Paths Meet :

Two chains eventually share the same sequence:

A → B → C
         ↓
         D → E → F
         ↑
X → Y → Z

The two paths merge at D.
Find the first common node.
This is commonly called the intersection of two linked lists.
 */

public class Find_where_two_point_meets {
    public static void main(String [] args){
        CNode head1 = new CNode('A');
        head1.next = new CNode('B');
        head1.next.next = new CNode('C');

        CNode head2 = new CNode('X');
        head2.next = new CNode('Y');
        head2.next.next = new CNode('Z');

        CNode merge = new CNode('D');
        merge.next = new CNode('E');
        merge.next.next = new CNode('F');

        head1.next.next.next = merge;
        head2.next.next.next = merge;

        CNode current1 = head1;
        CNode current2 = head2;

        System.out.print("List 1 :- ");
        while(current1!=null){
            System.out.print(current1.ch+" -> ");
            current1 = current1.next;
        }
        System.out.println("null");
        current1 = head1;

        System.out.print("List 2 :- ");
        while(current2!=null){
            System.out.print(current2.ch+" -> ");
            current2 = current2.next;
        }
        System.out.println("null");
        current2 = head2;

        while(current1!=null && current2!=null){
            if(current1.ch == current2.ch){
                System.out.println("Common Link :- "+current1.ch);
                break;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
    }
}
