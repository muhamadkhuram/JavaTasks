// Define a class Employee with attributes name, ID, and salary.
// Create an array of 5 employees and display their details.
public class Employee {

    // Constructor
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Attributes
    String name;
    String id;
    double salary;

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}