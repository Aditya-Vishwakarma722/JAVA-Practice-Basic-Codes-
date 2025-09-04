class construct{
    int roll_no;
    String name;

    //It can also be called Constructor Overloading ;)

    //Constructor With Parameters :)
    construct(String str, int number){
        name = str;
        roll_no = number;
    }

    //Constructor without Parameters :)
    construct(){
        name = "Psyko";
        roll_no = 234;
    }

    public void diplay(){
        System.out.println("Name : "+name+"\nRoll no. : "+roll_no);
    }
}

public class Constructors {
    public static void main(String[] args){
        construct cnr = new construct("Aditya",616);
        construct cnr2 = new construct();

        cnr.diplay();
        System.out.print("\n");
        cnr2.diplay();
    }
}