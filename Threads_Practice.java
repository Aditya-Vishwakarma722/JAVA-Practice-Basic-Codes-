class greetings1 extends Thread{

    public greetings1(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        for(i = 0 ; i<1000 ; i++){
            System.out.println("Good Morning "+(i+1));
        }
    }
}

class greetings2 extends Thread{

    public greetings2(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        for(i = 0 ; i<1000 ; i++){
            System.out.println("Welcome "+(i+1));
        }
    }
}

class greetings3 extends Thread{

    public greetings3(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        for(i = 0 ; i<1000 ; i++){
            System.out.println("How are you?  "+(i+1));
        }
    }
}

public class Threads_Practice {
    public static void main(String[] args) {
        greetings1 gt1 = new greetings1("Aditya1");
        greetings2 gt2 = new greetings2("Aditya2");
        greetings3 gt3 = new greetings3("Aditya3");

        System.out.println("Thread 1 :- "+gt1.getName()+" "+gt1.threadId());
        System.out.println("Thread 2 :- "+gt2.getName()+" "+gt2.threadId());
        System.out.println("Thread 3 :- "+gt3.getName()+" "+gt3.threadId());

        gt1.setPriority(1);
        gt2.setPriority(10);
        gt3.setPriority(5);

        gt1.start();
        gt2.start();
        try {
            gt2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        gt3.start();

    }
}
