public class Student {
    
    String name;
    String email;
    double weight;
    int id;
    String department;
    int departmentId;


    void displayInfo() {
        double ConvertToPounds = convertToPounds(weight);
        System.out.printf("Welcome! %s, your email is %s, and you weigh %.2f kg, and your id is %d, and your department is %s , with id %d, converted to pounds is %.2flbs" , name, email,weight, id, department, departmentId, ConvertToPounds);
    }

    double convertToPounds(double weight){
        double weightConversion = 2.2046 * weight;
      
        return weightConversion;
    }
}


