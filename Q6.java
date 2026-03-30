/*6. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named ‘Rectangle’ with a method named ‘Area’
which returns the area and length and breadth passed as parameters to its
constructor.*/

class Rectangle {
    
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int Area() {
        return length * breadth;
    }
}

public class Q6 {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        System.out.println("Area of the first rectangle: " + rect1.Area());

        System.out.println("Area of the second rectangle: " + rect2.Area());
    }
}
