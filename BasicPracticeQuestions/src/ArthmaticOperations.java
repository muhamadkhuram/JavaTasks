
import java.util.Scanner;


// take two integers as input and perform arithmetic operations

class ArthmaticOperations {
    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking two integers as input
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        ArthmaticOperations operations = new ArthmaticOperations();

        // Performing arithmetic operations

        // SUM
        operations.sum(a, b);

        // SUBTRACTION
        operations.subtract(a, b);

        // MULTIPLICATION
        operations.multiply(a, b);

        // DIVISION
        operations.divide(a, b);
    }
}