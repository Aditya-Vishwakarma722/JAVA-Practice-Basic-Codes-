import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Deque_Problem {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Deque<Integer> DQ = new ArrayDeque<>();

        while(t-->0){
            int x = scn.nextInt();
            int y = scn.nextInt();

            if(x==1) DQ.addLast(y);
            if(x==2) DQ.addFirst(y);
            if(x==3) System.out.println(DQ.isEmpty()?-1:DQ.peekLast());
            if(x==4) System.out.println(DQ.isEmpty()?-1:DQ.peekLast());
            if(x==5) if(!DQ.isEmpty()) DQ.removeLast();
            if(x==6) if(!DQ.isEmpty()) DQ.removeFirst();
        }
    }
}
