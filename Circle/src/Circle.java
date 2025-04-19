// Define a class Circle with a private radius and a public function to calculate the area

public class Circle {

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;

    // Method to calculate area
    public double calculateArea() {
        // Area of circle = π * r^2
        double pi = 3.14;
        
        return pi * radius * radius;
    }

}
