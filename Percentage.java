import java.sql.SQLOutput;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Student Percentage Calculator :");
        System.out.print("Enter Student Name : ");
        String name = scn.nextLine();
        System.out.print("Enter Maths Marks : ");
        int maths = scn.nextInt();
        System.out.print("Enter Physics Marks : ");
        int phy = scn.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        int chem = scn.nextInt();
        System.out.print("Enter English Marks : ");
        int eng = scn.nextInt();
        System.out.print("Enter IT Marks : ");
        int it = scn.nextInt();

        int total = maths+phy+chem+eng+it;
        float percent = total/5;

        System.out.println("Student Name : "+name);
        System.out.println("Percentage : "+percent);
    }

}
