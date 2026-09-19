
class Shape{
    String color;

    Shape(String color){
        this.color = color;
    }
    void displayColor(){
        System.out.println("color: " + color);
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    double area(){
        return width*height;
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    double area(){
        return radius*radius*3.14;
    }
}

public class JAVA_6 {
    public static void main(String[] args) {
        Circle circle = new Circle(500, "Red");
        Rectangle rectangle = new Rectangle(500, 500, "Red");

        circle.displayColor();
        circle.area();
        rectangle.displayColor();
        rectangle.area();

    }
}
