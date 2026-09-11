/*
The Train Coaches :

A train has coaches connected sequentially:
10 → 20 → 30 → 40 → 50

A new coach numbered 25 needs to be attached between 20 and 30.

After the operation:
10 → 20 → 25 → 30 → 40 → 50

*/

import java.util.LinkedList;
import java.util.List;

class Node{
    int num;
    Node next;

    Node(int num){
        this.num = num;
        this.next = null;
    }
}

public class Train_Coaches {
    public static void main(String [] args){
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        node.next.next.next = new Node(40);
        node.next.next.next.next = new Node(50);

        int num = 25;
        Node current = node;

        while(current!=null){
            System.out.print(current.num+"\t");
            current = current.next;
        }
        System.out.println();

        current = node;
        while(current != null && current.next != null){
            if(num>current.num && num<current.next.num){
                Node newNode = new Node(num);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }

        current = node;
        while(current!=null){
            System.out.print(current.num+"\t");
            current = current.next;
        }

    }
}
