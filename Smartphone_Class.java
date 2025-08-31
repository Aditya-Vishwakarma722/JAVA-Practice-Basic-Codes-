import java.util.Scanner;

class smartphone{

    void mode1(){
        System.out.println("Ringing...");
    }

    void mode2(){
        System.out.println("Vibrating Mode...");
    }

    void mode3(){
        System.out.println("Silent Mode...");
    }

    void mode4(){
        System.out.println("Airplane Mode...");
    }

}

public class Smartphone_Class {
    public static void main(String[] args){

        int turn_mode;
        smartphone cases = new smartphone();
        Scanner scn = new Scanner(System.in);

        System.out.print("[1 - Ringing]\n[2 - Vibration]\n[3 - Silent]\n[4 - Airplane] \nEnter the mode :- ");
        turn_mode = scn.nextInt();

        System.out.print("Turning on ");
        switch (turn_mode){
            case 1:
                cases.mode1();
                break;

            case 2:
                cases.mode2();
                break;

            case 3:
                cases.mode3();
                break;

            case 4:
                cases.mode4();
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }

    }
}
