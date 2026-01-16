import java.util.Scanner;

public class Exception_Handling2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        try{
            int num = scn.nextInt();
            System.out.println("Result = "+(num*num));
        }
        catch(Exception e){
            System.out.print("Exception Found : ");
            System.out.println(e);
        }

        scn.nextLine();

        float [] arr = new float[5];
        arr[0] = 20.2f;
        arr[1] = 40.43f;
        arr[2] = 60.84f;
        arr[3] = 80.91f;
        arr[4] = 100.63f;

        System.out.print("Enter Array Index [Limit - 5] : ");
        try{
            int index = scn.nextInt();
            System.out.println("Result = "+(10000.0/arr[index]));
        }
        catch(Exception e){
            System.out.print("Exception Found : ");
            System.out.println(e);
        }

    }
}
