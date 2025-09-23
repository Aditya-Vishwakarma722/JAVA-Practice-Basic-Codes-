/*abstract class pen{
    abstract void write();
    abstract void refill();
}

abstract class fountainPen{
    abstract void changeLib();
}

class ops extends pen{
    void write(){
        System.out.println("You can Write now!");
    }

    void refill(){
        System.out.println("The Pen needs Refill!");
    }
}

class fops extends fountainPen{
    void changeLib(){
        System.out.println("Change the Lib!");
    }
}
 */


/*
interface human{
    void eating();
    void sleeping();
}

interface monkey{
    void bitting();
    void jumping();
}

class action implements monkey, human{
    public void eating(){
        System.out.println("Humans eat!");
    }

    public void sleeping(){
        System.out.println("Humans Sleep!");
    }

    public void bitting(){
        System.out.println("Monkeys bite!");
    }

    public void jumping(){
        System.out.println("Monkyes jump!");
    }
}

 */

import java.util.Scanner;

import static java.lang.System.exit;

interface TVRemote{
    void action();
}

class VolUp implements TVRemote{
    public void action(){
        System.out.println("Volume Increasing....");
    }
}

class VolDown implements TVRemote{
    public void action(){
        System.out.println("Volume Decreasing....");
    }
}

class NextChannel implements TVRemote{
    public void action(){
        System.out.println("Changing to Next Channel....");
    }
}

class PrevChannel implements TVRemote{
    public void action(){
        System.out.println("Changing to Previous Channel....");
    }
}

class TurnOn implements TVRemote{
    public void action(){
        System.out.println("Turning ON the TV....");
    }
}

class TurnOff implements TVRemote{
    public void action(){
        System.out.println("Turning OFF the TV....");
    }
}


public class Abstarct_Interface_Practice {
    public static void main(String[] args){
        /*
        ops op = new ops();
        fops fp = new fops();
        op.write();
        op.refill();
        fp.changeLib();
         */

        /*
        action ac = new action();
        ac.bitting();
        ac.eating();
        ac.jumping();
        ac.sleeping();
         */

        Scanner scn = new Scanner(System.in);
        String choice,opt;
        System.out.println("You have the TV Remote!\nActions that can be performed : ");
        do {
            System.out.println("1. Turn Off the TV \n2. Turn ON the TV \n3. Turn the Volume Up \n4. Turn the Volume Down \n5. Change to next Channel \n6. Change to Previous Channel \n7. Exit \nChoose Your Action : ");
            choice = scn.nextLine().toLowerCase();

            switch(choice){
                case "turn off the tv":
                    TVRemote tv = new TurnOff();
                    tv.action();
                    break;

                case "turn on the tv":
                    TVRemote tv1 = new TurnOn();
                    tv1.action();
                    break;

                case "turn the volume up":
                    TVRemote tv2 = new VolUp();
                    tv2.action();
                    break;

                case "turn the volume down":
                    TVRemote tv3 = new VolDown();
                    tv3.action();
                    break;

                case "Change to next Channel":
                    TVRemote tv4 = new NextChannel();
                    tv4.action();
                    break;

                case "Change to Previous Channel":
                    TVRemote tv5 = new PrevChannel();
                    tv5.action();
                    break;

                case "exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unknown command!");
            }
            System.out.println("Do you want to Perform more Actions [Yes/No] : ");
            opt = scn.nextLine().toLowerCase();
        }while(opt.equals("yes"));
    }
}
