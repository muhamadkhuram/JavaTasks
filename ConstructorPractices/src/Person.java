
public class Person {

    // Constructor with default values for name and age
    public Person() {
        this.name = "Unknown";
        this.age = 10;
    }

    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}