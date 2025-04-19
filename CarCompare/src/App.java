public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Create two car objects
        Car car1 = new Car("Toyota", "Camry", 2020);

        Car car2 = new Car("Honda", "Civic", 2021);

        // Compare their models
        boolean isSameModel = car1.isSameModel(car2);

        if (isSameModel) {
            System.out.println("The cars have the same model: " + car1.model);
        } else {
            System.out.println("The cars have different models: " + car1.model + " and " + car2.model);
        }

    }
}
