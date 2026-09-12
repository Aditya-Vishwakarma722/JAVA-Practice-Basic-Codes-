/*

Find the Middle Person :

People are standing in a sequence:
A → B → C → D → E

Find the person standing exactly in the middle.

For an even number:
A → B → C → D → E → F
 */

public class Find_Middle_Person {
    public static void main(String [] args){
        CNode head = new CNode('A');
        head.next = new CNode('B');
        head.next.next = new CNode('C');
        head.next.next.next = new CNode('D');
        head.next.next.next.next = new CNode('E');
        head.next.next.next.next.next = new CNode('F');

        CNode current = head;
        int count = 0;
        while(current!=null){
            count+=1;
            System.out.print(current.ch+" ");
            current = current.next;
        }
        System.out.println("\n"+count);
        current = head;

        int middle = 0;
        if(count%2==0){
            middle = (count/2)+1;
        }
        else{
            middle = (count+1)/2;
        }

        int i=1;
        while(current!=null && i<=middle){
            if(i==middle){
                System.out.println("Middle Element : "+current.ch);
                break;
            }
            current = current.next;
            i++;
        }

    }
}
