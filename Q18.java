/*18. A bank has a fixed interest rate that should not be changed once it is defined.
Question:
Create a class Bank with a final variable interestRate.
Create a method calculateInterest(double amount) that calculates the interest using
the fixed rate.
Write a program to calculate interest for different customers.*/

class Bank {
    final double interestRate = 0.05;

    double calculateInterest(double amount) {
        return amount * interestRate;
    }
}

public class Q18 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        double customer1 = 10000.0;
        double customer2 = 25000.0;

        System.out.println("Interest for Customer 1: " + bank.calculateInterest(customer1));
        System.out.println("Interest for Customer 2: " + bank.calculateInterest(customer2));
    }
}
