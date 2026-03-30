/*1.Create a class called Person with name (String) and age (int) attributes. Implement
a constructor to set these attributes upon object creation. Create two Person objects,
set their details, and print them.*/

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Q1{
    public static void main(String[]args){
        Person P1 = new Person("Raj",12);
        Person P2 = new Person("Priya",13);
        P1.display();
        P2.display();
    }
}