class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i < 10){
            System.out.println("Printing Thread....");
            i++;
        }
    }
}


public class Thread_Constructor {
    public static void main(String[] args) {

        MyThr th1 = new MyThr("Aditya");
        MyThr th2 = new MyThr("Vishwa");

        /*
                 FOR THREAD PRIORITY
                 th1.setPriority(Thread.MAX_PRIORITY)
         */

        th1.start();
        th2.start();

        System.out.println("\nName of Thread 1 : "+th1.getName()+"\nID of Thread 1 : "+th1.getId());
        System.out.println("Name of Thread 2 : "+th2.getName()+"\nID of Thread 2 : "+th2.getId());
    }
}
