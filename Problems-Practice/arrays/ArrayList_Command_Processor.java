/*
ArrayList Command Processor :
Start with an empty list.

You receive commands:
ADD 10
ADD 20
ADD 30
REMOVE 1
ADD 40

After executing all commands, print the final list.
For example:
ADD 10
ADD 20
ADD 30
REMOVE 1
ADD 40

produces:
[10, 30, 40]
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Command_Processor {
    public static void main(String [] args){
        String[] commands = {"ADD 10", "ADD 20", "ADD 30", "REMOVE 1", "ADD 40"};
        List<Integer> list = new ArrayList<>();

        for(String command : commands){
            String [] parts = command.split(" ");
            String instruction = parts[0];
            int num = Integer.parseInt(parts[1]);

            switch (instruction){
                case "ADD":
                    list.add(num);
                    break;

                case "REMOVE":
                    list.remove(num);
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
        System.out.println(list);

    }
}
