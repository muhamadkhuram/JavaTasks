// Create a class Rectangle with private attributes length and width, and public methods to calculate the area and perimeter.

public class Rectangle {
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length;
    double width;

    public double calculateArea() {
        // Area = length * width
        return length * width;
    }

    public double calculatePerimeter() {
        // Perimeter = 2 * (length + width)
        return 2 * (length + width);
    }

}
