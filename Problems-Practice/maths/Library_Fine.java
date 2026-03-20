import java.util.Scanner;

class fine_check{
    public int checker(int d1, int m1, int y1, int d2, int m2, int y2){
        if(y1!=y2) return 10000;
        if(y1==y2 && m1>m2) return 500*(m1-m2);
        if(y1==y2 && m1==m2 && d1>d2) return 15*(d1-d2);
        else return 0;
    }
}

public class Library_Fine {
    public static void main(String [] agrs){
        int d1, m1, y1;
        int d2, m2, y2;
        Scanner scn = new Scanner(System.in);
        fine_check fine_checker = new fine_check();
        d1 = scn.nextInt();
        m1 = scn.nextInt();
        y1 = scn.nextInt();
        d2 = scn.nextInt();
        m2 = scn.nextInt();
        y2 = scn.nextInt();

        System.out.println(fine_checker.checker(d1,m1,y1,d2,m2,y2));
    }
}
