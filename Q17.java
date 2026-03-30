/*17. A company wants to track how many employees have been created in the
system.
Question:
Create a class Employee with attributes name and id.
Use a static variable employeeCount that increases every time a new object is
created.
Write a program that:
 Creates multiple employee objects
 Displays the total number of employees using a static method*/

class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}

public class Q17 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        System.out.println("Total number of employees: " + Employee.getEmployeeCount());
    }
}

