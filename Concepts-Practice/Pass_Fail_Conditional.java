import java.util.Scanner;

public class Pass_Fail_Conditional {
    public static void main(String[] args){
        float sub1, sub2, sub3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Subject Marks : ");
        sub1 = sc.nextFloat();
        System.out.print("Enter 2nd Subject Marks : ");
        sub2 = sc.nextFloat();
        System.out.print("Enter 3rd Subject Marks : ");
        sub3 = sc.nextFloat();

        float obtained = ((sub1+sub2+sub3)/300)*100;

        if(obtained<40 || sub1<33 || sub2<33 || sub3<33){
            System.out.print("Failed!\n");
        }
        else{
            System.out.print("Passed!\n");
        }
    }
}
