
public class Car {

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String brand;
    int year;

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

}
