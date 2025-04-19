public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
