public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Create an array of 5 employees
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Khuram", "E001", 999999999999999999999.9);
        employees[1] = new Employee("Dilshad", "E002", 60000);
        employees[2] = new Employee("Kumail", "E003", 55000);
        employees[3] = new Employee("Jawad", "E004", 70000);
        employees[4] = new Employee("Ali", "E005", 65000);

        // Display their details
        for (Employee employee : employees) {
            employee.displayDetails();
        }

    }
}
