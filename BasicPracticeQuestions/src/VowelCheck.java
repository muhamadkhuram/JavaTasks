public class VowelCheck {
    // take an input from the user;
    // check if the input is a vowel or not;
    // with the help of switch

    // case, print the result;

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Taking character as input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // for string 
        // String str = scanner.nextLine();
        // char ch = str.charAt(0);
        // but better to use next() method to take a single character

        // Check if the character is a vowel or not
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
                break;
        }
    }
}
