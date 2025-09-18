abstract class actions{
    abstract void display1();
    abstract int addition(int a , int b);
    abstract int subtarction(int a , int b);
    abstract int multiplication(int a , int b);
}

class results extends actions{
    @Override
    void display1(){
        System.out.println("Calculations of numbers : ");
    }

    @Override
    int addition(int a, int b) {
        return a+b;
    }

    @Override
    int subtarction(int a, int b) {
        return a-b;
    }

    @Override
    int multiplication(int a, int b) {
        return a*b;
    }

}

public class Abstract_Classes {
    public static void main(String[] args){
        results rs = new results();
        rs.display1();
        System.out.println("Addition : "+rs.addition(10,20));
        System.out.println("Subtraction : "+rs.subtarction(40,10));
        System.out.println("Multiplication : "+rs.multiplication(25,45));
    }
}
