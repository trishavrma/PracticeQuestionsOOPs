/*9. In a Calculator class, create multiple methods named add() with different
parameter lists (e.g., one taking two integers, another taking three integers, and a
third taking two doubles).
Call the add() method with various arguments in your main program, demonstrating
that the correct method is selected at compile time based on the arguments provided.*/

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = calc.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = calc.add(3.14, 2.71);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
