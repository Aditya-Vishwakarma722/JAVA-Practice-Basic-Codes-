public class Exception_Handeling {
    public static void main(String[] args) {
        float a = 1000;
        float b = 0;

        while(b<100){
            try {
                float c = a / b;
                System.out.println("1000 / " + b + " = " + c);
            } catch (Exception e) {
                System.out.print("Error Found : ");
                System.out.println(e);
            }
            b++;
        }
        System.out.println("\nEnd of the Program!");
    }
}
