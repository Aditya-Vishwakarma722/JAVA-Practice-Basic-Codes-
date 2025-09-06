import java.util.Scanner;

//   >>>>> This one is for Contructors Practice <<<<<

class Cylinder{
    int radius;
    int height;

    Cylinder(int num1, int num2){
        radius = num1;
        height = num2;
    }

    void findvolume(){
        System.out.printf("Volume of the Cylinder : %.2f\n",(3.14*radius*radius*height));
    }
}

class shapes{
    private int length;
    private int width;
    private int height;

    void setLength(int num1){
        this.length = num1;
    }

    void setWidth(int num2){
        this.width = num2;
    }

    void setHeight(int num3){
        this.height = num3;
    }

    int cube(){
        return length*width*height;
    }

    int cuboid(){
        return length*width*height;
    }

}

public class Constructors_Practice {
    public static void main(String[] ras){

        // >>>>>>>>>> Contructors Practice <<<<<<<<<<

        Scanner scn = new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter the Radius of the Cylinder : ");
        n1 = scn.nextInt();

        System.out.print("Enter the Height of the Cylinder : ");
        n2 = scn.nextInt();
        scn.nextLine();


        Cylinder cyl = new Cylinder(n1,n2);
        cyl.findvolume();

        // >>>>>>>>>> Private access specifier Practice <<<<<<<<<<

        shapes sp = new shapes();

        System.out.print("Enter the Shape [Cube/Cuboid] : ");
        String name = scn.nextLine().toLowerCase();

        if(name.equals("cube")){
            System.out.print("Enter the Length of the Cube [cm] : ");
            int l = scn.nextInt();
            sp.setLength(l);

            System.out.print("Enter the Length of the Cube [cm] : ");
            int w = scn.nextInt();
            sp.setWidth(w);

            System.out.print("Enter the Height of the Cube [cm] : ");
            int h = scn.nextInt();
            sp.setHeight(h);

            System.out.println("The Volume of the Cube : "+(sp.cube()));

        }

        else if(name.equals("cuboid")){
            System.out.print("Enter the Length of the Cuboid [cm] : ");
            int l = scn.nextInt();
            sp.setLength(l);

            System.out.print("Enter the Length of the Cuboid [cm] : ");
            int w = scn.nextInt();
            sp.setWidth(w);

            System.out.print("Enter the Height of the Cuboid [cm] : ");
            int h = scn.nextInt();
            sp.setHeight(h);

            System.out.println("The Volume of the Cuboid : "+(sp.cuboid()));

        }

        else{
            System.out.println("Invalid Input!");
        }

    }
}
