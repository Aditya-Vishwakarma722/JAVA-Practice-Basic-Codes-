import java.util.Scanner;

public class Replace_Characters {
    public static void main(String[] args){
        String mainstring;
        Scanner snn = new Scanner(System.in);
        System.out.print("Enter Your Sentence : ");
        mainstring = snn.nextLine();

        String underscore = mainstring.replace(' ','_');
        System.out.println("Replaced Sentence : "+underscore);
    }
}
