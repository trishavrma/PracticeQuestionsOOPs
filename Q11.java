/*11. A drawing application is being developed where different shapes can be created.
All shapes share some common properties, so a base class Shape is created with a
method display() to show general shape information.
Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
has its own method to calculate and display its area.
This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
single base class.*/

class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        super.display();
        System.out.println("Shape: Circle");
    }

    public void calculateAndDisplayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void display() {
        super.display();
        System.out.println("Shape: Rectangle");
    }

    public void calculateAndDisplayArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.display();
        circle.calculateAndDisplayArea();

        System.out.println();

        rectangle.display();
        rectangle.calculateAndDisplayArea();
    }
}
