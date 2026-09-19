package ITC.exercise5;

class Vehicle{
    String brand;
    int year;

    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    void start(){
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    Car(String brand, int year, int numberOfDoors){
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCar(){
        System.out.println("===== Car =====");
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
        System.out.println("Number of doors: " + this.numberOfDoors);
    }
}

public class JAVA_1 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 1994, 4);
        Car car2 = new Car("BMW", 2000, 2);

        car1.displayCar();

        car2.displayCar();

    }
}
