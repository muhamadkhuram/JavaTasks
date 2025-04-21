public class Employee {
    // Constructor with parameters
    public Employee(String id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    String id;
    String name;
    double basicSalary;

    // method that calculate the salary of the employee and add 10% to the basic
    // salary
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.10);
    }

}
