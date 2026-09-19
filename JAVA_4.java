package ITC.exercise5;

class Person{

    void introduce(){
        System.out.println("I am a person");
    }
}
class Teacher extends Person{

    @Override
    void introduce(){
        super.introduce();
        System.out.println("I am a Teacher");
    }
}

public class JAVA_4 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.introduce();
    }
}
