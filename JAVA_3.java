package ITC.exercise5;

class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class JAVA_3 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

    }
}
