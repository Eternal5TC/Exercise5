
class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayInfo(){
        System.out.println("===== EMPLOYEE INFO =====");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    String department;

    Manager(String name, double Salary, String department){
        super(name, Salary);
        this.department = department;
    }

    void displayInfo(){
        System.out.println("===== MANAGER INFO =====");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class JAVA_2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Sasa", 5000, "GIC");

        manager.displayInfo();

    }
}
