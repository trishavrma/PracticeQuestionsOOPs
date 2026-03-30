/*7. Create an abstract class Shape with an abstract method calculate_area() and a
concrete method display_info(). Create concrete subclasses
like Circle and Rectangle that must implement their own specific logic
for calculate_area(). Try to instantiate an object of the Shape class directly and
observe the compilation error. Use the subclass objects to call both abstract and
concrete methods.*/

public class Q7 {

    public static abstract class Shape {
        protected String name;

        public Shape(String name) {
            this.name = name;
        }

        public abstract double calculate_area();

        public void display_info() {
            System.out.println("This is a " + name + ".");
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        public double calculate_area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            super("Rectangle");
            this.length = length;
            this.width = width;
        }


        public double calculate_area() {
            return length * width;
        }
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5.0);

        Rectangle rectangle = new Rectangle(4.0, 6.0);

  
        System.out.println("Circle Information:");
        circle.display_info();
        System.out.println("Area: " + circle.calculate_area()); 

        System.out.println("\nRectangle Information:");
        rectangle.display_info();
        System.out.println("Area: " + rectangle.calculate_area());

        Shape polyCircle = new Circle(3.0);
        System.out.println("\nPolymorphic Circle Area: " + polyCircle.calculate_area());
    }
}
