public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Create a Person object using the default constructor
        Person person = new Person();
        person.display(); // Output: Name: Unknown, Age: 10

        // Create a Car object using the constructor with parameters
        Car car = new Car("Toyota", 2020);
        car.display();

        // Create a Student object using the constructor with parameters
        Student student = new Student("Dilshad", "A+");
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Grade: " + student.grade);

        // Create a Student object using the default constructor
        Student defaultStudent = new Student();
        System.out.println("Default Student Name: " + defaultStudent.name); // Output: Default Student Name: Khuram
        System.out.println("Default Student Grade: " + defaultStudent.grade); // Output: Default Student Grade: A+

        // Create a Book object using the parameterized constructor
        Book book = new Book("Java Programming", 29.99);
        book.display(); // Output: Title: Java Programming, Price: 29.99
        // copy
        Book bookCopy = book.createCopy(book);
        bookCopy.display(); // Output: Title: Java Programming, Price: 29.99

        // Create a BankAccount object using the default constructor
        BankAccount account = new BankAccount(
                "23423453242323542", 999999999.9, "Khuram");
        System.out.println("Account Number: " + account.accountNumber); // Output: Account Number: 00000000
        System.out.println("Balance: " + account.balance); // Output: Balance: 0.0
        System.out.println("Account Holder Name: " + account.accountHolderName); // Output: Account Holder Name: Unknown

        // employee object with default constructor, calculateSalary method that adds
        // 10% to the basic salary
        Employee employee = new Employee("123", "Khuram", 50000.0);
        System.out.println("Employee ID: " + employee.id); // Output: Employee ID: 123
        System.out.println("Employee Name: " + employee.name); // Output: Employee Name: Khuram
        System.out.println("Employee Salary: " + employee.calculateSalary()); // Output: Employee Salary: 55000.0
        employee.calculateSalary(); // Output: Employee Salary: 55000.0

    }
}
