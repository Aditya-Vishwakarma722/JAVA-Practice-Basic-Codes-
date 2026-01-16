
class info{
    int roll_no;
    String name;
    double fees;

    void display(){
        System.out.println("Name :- "+name+"\nRoll no :- "+roll_no+"\nFees :- "+fees);
    }
}

//Making this for Static Input

public class Classes_Creation {
    public static void main(String[] args){
        info student1 = new info();
        info student2 = new info();

        student1.roll_no = 26821;
        student1.name = "Aditya Vishwakarma";
        student1.fees = 1793.39;

        student2.roll_no = 26823;
        student2.name = "Ravi Vishwakarma";
        student2.fees = 1462.67;

        student1.display();
        System.out.println(" ");
        student2.display();

    }
}
