/*4. Define a class Resort with the following description:
 Members are: RNo to store Room Number, Name store customer name,
Charges to store per day charges, Days to store number of days of stay.
 Member functions:
 Compute() to calculate and return Amount as Days * Charges and if the
values of Days*Charges is more than 11000 then as 1.02*Days*Charges
 Getinfo() A function to enter the content Rno, Name, Charges and Days.
 DispInfo() A function to enter the content Rno, Name, Charges, Days and
Amount by calling function Compute().*/

import java.util.Scanner;

public class Q4 {
    private int RNo;
    private String Name;
    private double Charges;
    private int Days;

    private double Compute() {
        double amount = Days * Charges;
        if (amount > 11000) {
            return 1.02 * Days * Charges;
        }
        return amount;
    }

    public void GetInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Per Day Charges: ");
        Charges = sc.nextDouble();
        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    public void DispInfo() {
        System.out.println("\n--- Resort Stay Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + Compute());
    }

    public static void main(String[] args) {
        Q4 guest = new Q4();
        guest.GetInfo();
        guest.DispInfo();
    }
}
