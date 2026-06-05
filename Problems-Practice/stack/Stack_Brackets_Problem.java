import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Brackets_Problem {
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t-->0) {
            String chars = scn.nextLine();
            Stack<Character> brackets = new Stack<>();
            boolean valid = true;
            for(int i=0;i<chars.length();i++){
                char ch = chars.charAt(i);
                if(ch=='('){
                    brackets.push(ch);
                }
                else if(ch==')'){
                    if(brackets.isEmpty()){
                        valid = false;
                        break;}
                    else{brackets.pop();}
                }
            }
            if(!brackets.isEmpty()) valid = false;

            System.out.println(valid?1:0);
        }
    }
}
