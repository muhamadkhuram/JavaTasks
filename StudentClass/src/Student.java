// Define a class Student with attributes name, roll number, and grade. Create an object and display its data.

public class Student {
    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    String name;
    int rollNumber;
    String grade;

    // Method to display student data
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
