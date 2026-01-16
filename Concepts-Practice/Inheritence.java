class parent{
    int x;

    parent(){
        System.out.println("This is a Constructor without Arguments! [Inside Parent]");
    }

    parent(int num1){
        System.out.println("This is Constructor with Arguments [Value = "+num1+"]");
    }
}

class child extends parent{
    int y;

    child(){
        System.out.println("This is a Constructor without Arguments! [Inside Child]");
    }

    child(int num1, int num2){
        super(num1);
        System.out.println("This is Constructor with Arguments [Value = "+num2+"]");
    }
}

class grandchild extends child{
    int z;

    grandchild(){
        System.out.println("This is a Constructor without Arguments! [Inside GrandChild]");
    }

    grandchild(int num1, int num2, int num3){
        super(num1,num2);
        System.out.println("This is a Constructor with Arguments [Value = "+num3+"]");
    }
}

public class Inheritence {
    public static void main(String[] args){
        //parent obj1 = new parent();
        //child obj2 = new child();

        grandchild check = new grandchild();
        System.out.println(" ");
        grandchild obj3 = new grandchild(5,10,15);
    }
}
