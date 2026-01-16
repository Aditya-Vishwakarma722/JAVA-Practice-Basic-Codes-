interface payment{
    void amount(int num);
    int converted(int num);
}

class payPal implements payment{
    public void amount(int num){
        System.out.println("Amount paid through PayPal = "+num+" Rs.");
    }
    public int converted(int num){
        return num*80;
    }
}

class debitCard implements payment{
    public void amount(int num){
        System.out.println("Amount paid through Debit Card = "+num+" Rs.");
    }
    public int converted(int num){
        return num*80;
    }
}

class creditCard implements payment{
    public void amount(int num){
        System.out.println("Amount paid through Credit Card = "+num+" Rs.");
    }
    public int converted(int num){
        return num*80;
    }
}

class googlePay implements payment{
    public void amount(int num){
        System.out.println("Amount paid through Google Pay = "+num+" Rs.");
    }
    public int converted(int num){
        return num*80;
    }
}

public class Interface_Polymorphism {
    public static void main(String[] args){
        payment p1 = new payPal();
        payment p2 = new debitCard();
        payment p3 = new creditCard();
        payment p4 = new googlePay();

        p1.amount(500);
        System.out.println("Converted into Dollars = "+p1.converted(500)+"$");
        p2.amount(1000);
        System.out.println("Converted into Dollars = "+p2.converted(1000)+"$");
        p3.amount(1500);
        System.out.println("Converted into Dollars = "+p3.converted(1500)+"$");
        p4.amount(2000);
        System.out.println("Converted into Dollars = "+p4.converted(2000)+"$");
    }
}
