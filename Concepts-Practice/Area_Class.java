import java.awt.*;
import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;

    int area(){
        return length*breadth;
    }
}

class Square{
    int side;

    int area(){
        return side*side;
    }
}

class Circle{
    double radius;

    double area(){
        return 3.14*radius*radius;
    }
}

class Triangle{
    double height;
    double base;

    double area(){
        return 0.5*base*height;
    }
}

public class Area_Class {
    public static void main(String[] args){
        String opt;
        Rectangle rec = new Rectangle();
        Square sqr = new Square();
        Circle crl = new Circle();
        Triangle trg = new Triangle();
        Scanner scn = new Scanner(System.in);

        do{
        System.out.println("Choose any 2D Shape : [Rectangle, Sqaure, Circle, Triangle]\nEnter your Choice : ");
        String choice = scn.nextLine().toLowerCase();

        switch(choice) {
            case "square":
                int num1;
                System.out.print("Enter the Side of the Square : ");
                num1 = scn.nextInt();
                scn.nextLine();
                sqr.side = num1;
                System.out.print("The Area of the Square = " + sqr.area() + "\n");
                break;

            case "rectangle":
                int l, b;
                System.out.print("Enter the Length of the Rectangle : ");
                l = scn.nextInt();
                scn.nextLine();
                System.out.print("Enter the Breadth of the Rectangle : ");
                b = scn.nextInt();
                scn.nextLine();
                rec.length = l;
                rec.breadth = b;
                System.out.print("The Area of the Rectangle = " + rec.area() + "\n");
                break;

            case "circle":
                double r;
                System.out.print("Enter the Radius of the Circle : ");
                r = scn.nextDouble();
                scn.nextLine();
                crl.radius = r;
                System.out.print("The Area of the Circle = " + crl.area() + "\n");
                break;

            case "triangle":
                double hei, base;
                System.out.print("Enter the Height of the Triangle : ");
                hei = scn.nextDouble();
                scn.nextLine();
                System.out.print("Enter the Base of the Triangle : ");
                base = scn.nextDouble();
                scn.nextLine();
                trg.height = hei;
                trg.base = base;
                System.out.print("The Area of the Triangle = " + trg.area() + "\n");
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }
            System.out.println("Do you want to Continue [Yes/No] : ");
            opt = scn.nextLine().toLowerCase();
            scn.nextLine();
        }while(opt.equals("yes"));
    }
}
