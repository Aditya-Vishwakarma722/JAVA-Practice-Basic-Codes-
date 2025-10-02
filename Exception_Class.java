import java.util.*;

class MyException extends Exception{

    @Override
    public String toString(){
        return "Printed toString";
    }

    @Override
    public String getMessage(){
        return "Printed GetMessage";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scn.nextInt();

        if(num <= 10){
            try {
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Number is OK!");
        }
    }
}
