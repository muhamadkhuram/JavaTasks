
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
        int a = 10;
        int b = 20;

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