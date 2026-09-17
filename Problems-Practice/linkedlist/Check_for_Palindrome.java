/*
Check for a Palindrome :

Determine whether:
R → A → C → E → C → A → R
reads the same forwards and backwards.

Output:
true

But:
R → A → C → E

returns:
false
 */

import java.util.Stack;

public class Check_for_Palindrome {
    public static void main(String[] args){
        CNode head = new CNode('R');
        head.next = new CNode('A');
        head.next.next = new CNode('C');
        head.next.next.next = new CNode('E');
        head.next.next.next.next = new CNode('C');
        head.next.next.next.next.next = new CNode('A');
        head.next.next.next.next.next.next = new CNode('R');

        int total = 0;
        CNode current = head;
        while(current!=null){
            System.out.print(current.ch+" -> ");
            current = current.next;
            total++;
        }
        System.out.println("null");
        System.out.println("Total Elements : "+total);

        Stack<Character> stack = new Stack<>();
        current = head;
        while (current != null) {
            stack.push(current.ch);
            current = current.next;
        }

        boolean isPalindrome1 = true;
        current = head;
        while (current != null) {
            if (current.ch != stack.pop()) {
                isPalindrome1 = false;
                break;
            }
            current = current.next;
        }
        System.out.println("Output: " + isPalindrome1);
        System.out.println();
    }
}
