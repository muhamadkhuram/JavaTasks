// Write a program to print the area of a rectangle by creating a class named 'Area' taking the
// values of its length and breadth as parameters of its constructor and having a method named
// 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are
// entered through keyboard.

public class Area {
    // Constructor to initialize length and breadth
    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double length;
    double breadth;

    // Method to calculate area
    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an object of Area class
        Area area = new Area(5.0, 3.0);
        // Print the area
        System.out.println("Area of rectangle: " + area.returnArea());
    }
}