// Write a program in which “show” class have multiple constructor.
// 1. 2. 3. 4. First constructor by default constructor just print :”Hello World”
// 2nd Constructor take single value and print table of value.
// 3rd constructor take two values and prints the sum of these values
// 4th constructor take three value and prints the average of these numbers

public class MultiConstructor {

    // Default constructor
    MultiConstructor() {
        System.out.println("Hello World");
    }

    // Constructor to print table of a number
    MultiConstructor(int number) {
        System.out.println("Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Constructor to print sum of two numbers
    MultiConstructor(int num1, int num2) {
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    // Constructor to print average of three numbers
    MultiConstructor(int num1, int num2, int num3) {
        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is: " +
                ((num1 + num2 + num3) / 3.0));
    }

    public static void main(String[] args) {
        // Creating objects to test the constructors
        new MultiConstructor(); // Calls default constructor
        new MultiConstructor(5); // Calls constructor with one parameter
        new MultiConstructor(5, 10); // Calls constructor with two parameters
        new MultiConstructor(5, 10, 15); // Calls constructor with three parameters
    }

}
