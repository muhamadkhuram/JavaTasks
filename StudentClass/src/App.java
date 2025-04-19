public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Student class is defined in the same folder;
        Student student = new Student("Khuram Iftikhar", 44, "B+");

        student.displayData();

    }
}
