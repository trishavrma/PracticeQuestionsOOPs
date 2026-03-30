/*13. A company wants to evaluate employee performance.
Create an abstract class Employee with:
 attributes: name, id
 abstract method calculateBonus()
Create subclasses:

 Manager → bonus is 20% of salary
 Developer → bonus is 10% of salary plus project incentive
Demonstrate runtime polymorphism by storing different employee objects in an
Employee reference and calling calculateBonus().*/

abstract class Employee {
    protected String name;
    protected String id;
    protected double salary; // Added salary attribute for bonus calculation

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Manager extends Employee {
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    private double projectIncentive;

    public Developer(String name, String id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    @Override
    public double calculateBonus() {
        return (salary * 0.10) + projectIncentive;
    }
}

public class Q13 {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", "M123", 80000);
        Employee emp2 = new Developer("Bob", "D456", 60000, 2000);

        System.out.println("Manager " + emp1.getName() + " bonus: $" + emp1.calculateBonus());
        System.out.println("Developer " + emp2.getName() + " bonus: $" + emp2.calculateBonus());
    }
}
