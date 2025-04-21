public class Student {

    // default value contructor
    public Student() {
        this.name = "Khuram";
        this.grade = "A+";
    }

    // constructor with parameters
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String name;
    String grade;
}
