// Implement a class Car with attributes make, model, and year.
// Create two objects and compare their models.

public class Car {
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Attributes
    String make;
    String model;
    int year;

    // Method to compare models
    public boolean isSameModel(Car otherCar) {
        return model.equals(otherCar.model);
    }

}
