/*14. Create a base class Person with method role().
Create subclasses:
 Employee
 Manager (extends Employee)
Override role() in each class and demonstrate multilevel inheritance with runtime
polymorphism.*/

class Person {
    public void role() {
        System.out.println("Role: General Person");
    }
}

class Employee extends Person {
    @Override
    public void role() {
        System.out.println("Role: Employee");
    }
}

class Manager extends Employee {
    @Override
    public void role() {
        System.out.println("Role: Manager");
    }
}

public class Q14 {
    public static void main(String[] args) {
        // Demonstrate multilevel inheritance and runtime polymorphism
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role(); // Calls Person's role()
        p2.role(); // Calls Employee's role() (overridden)
        p3.role(); // Calls Manager's role() (overridden via Employee -> Person chain)
    }
}
