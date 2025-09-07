class Class1{
    int a;
    int b;

    void setA(int a){
        this.a = a;
    }

    void setB(int b){
        this.b = b;
    }

    void display(){
        System.out.println("Constructor 1 inside Class1 with Value = "+a);
    }

    void display2(){
        System.out.println("Method 2 inside Class1 with Value = "+b);
    }
}

class Class2 extends Class1{
    //This is Method Overriding!
    void display2(){
        System.out.println("Method 1 inside Class2 with Values "+a+" & "+b);
    }
}

public class Method_Overriding {
    public static void main(String[] args){
        Class1 cs1 = new Class1();
        Class2 cs2 = new Class2();

        cs1.setA(100);
        cs1.setB(200);
        cs2.setA(100);
        cs2.setB(200);

        cs1.display();
        cs1.display2();
        cs2.display2();
    }
}
