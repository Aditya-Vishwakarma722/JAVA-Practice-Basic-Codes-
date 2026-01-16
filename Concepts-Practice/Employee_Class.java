class Employee{
    String name;
    int salary;

    int gettheSalary(){
        return salary;
    }

    String getthename(){
        return name;
    }

    void setthename(String str){
        name = str;
    }

}

//THIS ONE IS FOR STATIC INPUT

public class Employee_Class {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        emp1.name = "Aditya Vishwakarma";
        emp2.name = "Ravi Vishwakarma";
        emp3.setthename("Rishabh Sharma");
        emp4.setthename("Om Sharma");

        emp1.salary = 25000;
        emp2.salary = 20000;
        emp3.salary = 21000;
        emp4.salary = 26000;

        String name1 = emp1.name;
        String name2 = emp2.name;
        String name3 = emp3.name;
        String name4 = emp4.name;

        int sal1 = emp1.gettheSalary();
        int sal2 = emp4.gettheSalary();
        int sal3 = emp3.gettheSalary();
        int sal4 = emp4.gettheSalary();

        System.out.println("Employee Details :-\n");
        System.out.println("Name - "+name1+"\nSalary - "+sal1);
        System.out.println("\nName - "+name2+"\nSalary - "+sal2);
        System.out.println("\nName - "+name3+"\nSalary - "+sal3);
        System.out.println("\nName - "+name4+"\nSalary - "+sal4);

    }
}
