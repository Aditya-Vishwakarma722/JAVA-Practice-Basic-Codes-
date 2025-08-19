import java.util.Scanner;

public class Switch_Questions {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Numbers to Days of the Week Conversion : ");
        System.out.print("Enter the number : ");
        int input = scn.nextInt();

        System.out.println("According to the Input...");
        switch (input){
            case 1:
                System.out.println("The Days is : Monday");
                break;

            case 2:
                System.out.println("The Days is : Tuesday");
                break;

            case 3:
                System.out.println("The Days is : Wednesday");
                break;

            case 4:
                System.out.println("The Days is : Thursday");
                break;

            case 5:
                System.out.println("The Days is : Friday");
                break;

            case 6:
                System.out.println("The Days is : Saturday");
                break;

            case 7:
                System.out.println("The Days is : Sunday");
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}
