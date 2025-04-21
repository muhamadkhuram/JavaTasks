import java.util.Scanner;

public class UserAge {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        final Scanner scanner = new Scanner(System.in);

        // Taking age as input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // if less than 18, you are a child, if between 18 and 60, you are an adult, if
        // more than 60, you are a senior citizen
        if (age < 18) {
            System.out.println("You are a child.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

    }
}
