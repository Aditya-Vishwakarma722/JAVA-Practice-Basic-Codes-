interface example{
    void func1();
    void func2();
    int func3(int a, int b);
}

interface example2{
    void func1();
}

public class Anonymous_Classes {
    static void main() {

        //ANONYMOUS CLASS METHOD
        example obj = new example() {
            @Override
            public void func1() {
                System.out.println("This is the First Method in the Interface");
            }

            @Override
            public void func2() {
                System.out.println("This is the Second Method in the Interface");
            }

            @Override
            public int func3(int a, int b) {
                return a*b;
            }
        };
        obj.func1();
        obj.func2();
        System.out.println(obj.func3(10,30));


        //LAMBDA METHOD
        example2 obj2 = ()->{
            System.out.println("This is Lambda");
        };

        obj2.func1();

    }
}
