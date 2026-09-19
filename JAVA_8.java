package ITC.exercise5;

class Math {
    void calculateAdd(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
    void calculateAdd(double a, double b) {
        System.out.println("Add: " + (a + b));
    }
    void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }
    void sub(String a, String b) {
        if (a.startsWith(b)) {
            System.out.println("Sub: " + a.substring(b.length()));
        } else {
            System.out.println("Parameter 2 is not found at the beginning.");
        }
    }
}


public class JAVA_8 {
    public static void main(String[] args) {
        Math math = new Math();

        math.calculateAdd(10, 20);
        math.calculateAdd(10.5, 20.5);
        math.sub(10, 3);
        math.sub("Hello", "He");
    }
}