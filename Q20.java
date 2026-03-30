/*20. A company wants to clearly assign constructor parameters to object variables.

Question:
Create a class Employee with variables name and salary.
Use this keyword inside the constructor to initialize object variables.
Display employee details.*/

public class Q20 {
    String name;
    double salary;

    public Q20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Q20 emp = new Q20("John Doe", 50000.0);
        emp.displayDetails();
    }
}
