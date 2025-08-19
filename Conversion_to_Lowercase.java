import java.sql.SQLOutput;
import java.util.Scanner;

public class Conversion_to_Lowercase {
    public static void main(String[] args){
        String sentence;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Sentence : ");
        sentence = scn.nextLine();

        String lowercase = sentence.toLowerCase();
        String uppercase = sentence.toUpperCase();
        System.out.println("Your Sentence in Lowercase : "+lowercase);
        System.out.print("Your Sentence in Uppercase : "+uppercase);
    }

}
