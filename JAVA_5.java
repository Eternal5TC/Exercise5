package ITC.exercise5;

class Person{

    String name;

    Person(String name){
        this.name = name;
    }
}
class Employee extends Person{

    double salary;
    Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }
}
class Developer extends Employee{
    String PL;
    Developer(String name, double salary, String PL){
        super(name, salary);
        this.PL = PL;
    }
    void display(){
        System.out.println("===== DEVELOPER INFO =====");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + PL);

    }

}

public class JAVA_5 {
    public static void main(String[] args) {
        Developer developer = new Developer("ciyou", 575.75, "java");
        developer.display();

    }
}
