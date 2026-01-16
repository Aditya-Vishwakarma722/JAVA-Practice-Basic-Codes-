import java.util.InputMismatchException;
import java.util.Scanner;

class NumbersException extends Exception{
    String Statement;
    public NumbersException(String statement){
        this.Statement = statement;
    }

    public String showmessage(){
        return Statement;
    }
}

class UserEnteredException extends Exception{
    String message;
    public UserEnteredException(String message){
        this.message = message;
    }

    public String show(){
        return message;
    }
}

class FindingArea{
    public double TriangleArea(double base, double height) throws NumbersException{

        if(base<0 || height<0){
            throw new NumbersException("One of the Number Entered is Negative");
        }
        if (base == 0 || height == 0) {
            throw new NumbersException("One of the Number Entered is Zero");
        }
        return 0.5*base*height;
    }
}

public class Exception_Class2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double b = 0;
        double h = 0;
        System.out.println("Let's do some calculation : ");
        try{
            try{
                System.out.println("Enter the Base of the Triangle : ");
                b = scn.nextDouble();
                System.out.println("Enter the Height of the Triangle : ");
                h = scn.nextDouble();
            }
            catch(InputMismatchException e){
                throw new UserEnteredException("One of the Entered Input is not a Number!");
            }
            FindingArea fa = new FindingArea();
            double ans = fa.TriangleArea(b,h);
            System.out.println("Area  = "+ans);
        }
        catch(NumbersException | UserEnteredException e){
            System.out.println("Caught an Exception : "+e.getMessage());
        }
    }
}
