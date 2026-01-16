import java.util.Scanner;

class square{
    int side;

    int area(){
        return side*side;
    }

    int perimeter(){
        return 4*side;
    }
}

public class Square_Area {
    public static void main(String[] args) {

        square sq = new square();
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Side of the Sqaure : ");
        int num = scn.nextInt();
        sq.side = num;

        System.out.println("The Perimeter = " + sq.perimeter());
        System.out.println("The Area = " + sq.area());

    }
}
