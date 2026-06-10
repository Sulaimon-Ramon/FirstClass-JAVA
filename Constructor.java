public class Constructor {

    String name;
    int age;
    double cgpa;

    public Constructor(String n, int a, double c) {
        name = n;
        age = a;
        cgpa = c;
    };

    void displayInfo() {
        System.out.printf("Hello, %-15s | Age: %d | CGPA: %.1f", name, age, cgpa);
    }

    public static void main(String[] args) {
        Constructor Student = new Constructor("Ramon", 18, 5.0);
        Student.displayInfo();
    }

}
