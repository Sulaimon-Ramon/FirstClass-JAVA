public class JavaClass {
    
    String name;
    String address;
    int age;
    double cgpa;

    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + cgpa);
    }
}

class InnerJavaClass {
  public static void main(String[] args) {
     
    JavaClass Ramon = new JavaClass();
    
     Ramon.name = "Sulaimon Ramon";
     Ramon.address = "Temidire, Ajegunle";
     Ramon.age = 19;
     Ramon.cgpa = 5.0;

     Ramon.displayInfo();
  }

}
