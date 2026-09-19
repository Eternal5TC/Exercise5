package ITC.exercise5;

import java.util.Scanner;

class Person{
    String name;
    int age;

    static Scanner input = new Scanner(System.in);

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void inputInfo(){
        System.out.print("Enter name:");
        name=input.nextLine();
        System.out.print("Enter age:");
        age=input.nextInt();

    }
    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

class Student extends Person{
    int studentID;
    char grade;

    Student (String name,int age, int studentID,char grade){
        super(name,age);
        this.grade=grade;
        this.studentID =studentID;
    }

    @Override
    void inputInfo(){
        super.inputInfo();
        System.out.print("Enter student ID:");
        studentID=input.nextInt();
        System.out.print("Enter grade:");
        grade=input.next().charAt(0);

        input.nextLine();
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("StudentID:"+studentID);
        System.out.println("Grade:"+grade);
    }

}
class Teacher extends Person{
    int teacherID;
    String subject;

    Teacher (String name,int age,int teacherID,String subject){
        super(name,age);
        this.subject=subject;
        this.teacherID=teacherID;
    }
    @Override
    void inputInfo() {
        super.inputInfo();
        System.out.print("Enter teacher ID:");
        teacherID = input.nextInt();
        System.out.print("Enter subject:");
        subject = input.next();
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("TeacherID:" + teacherID);
        System.out.println("Subject:" + subject);
    }

}

public class JAVA_7 {
    public static void main(String[] args) {
        Student student = new Student("", 0, 0, ' ');
        Teacher teacher = new Teacher("", 0, 0, "");

        System.out.println("===== INPUT STUDENT =====");
        student.inputInfo();
        System.out.println("\n===== STUDENT INFORMATION =====");
        student.displayInfo();

        System.out.println("\n===== INPUT TEACHER =====");
        teacher.inputInfo();

        System.out.println("\n===== TEACHER INFORMATION =====");
        teacher.displayInfo();

    }
}
