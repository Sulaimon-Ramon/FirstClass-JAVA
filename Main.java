
public class Main {
    public static void main(String[] args){
        String name = "Ramon";
        String occupation = "Software Engineer";
        int age = 18;
        double height = 6.2;
        String sex = "male";
        String DOB = "20/11/2006";

        System.out.println("Hello!, My name is: " + name);
        System.out.println("I am a: " + occupation);
        System.out.println("I am : " + age + " years old");
        System.out.println("I am: " + height + " inches tall");
        System.out.println("I am a: " + sex);
        System.out.println("I was born: " + DOB);


        int value = 9;
        int result = value++;

        System.out.println(value);
        System.out.println(result);


        int points = 5;
        int bonus = 10;
        int lives =  3;
         
        
        int result1 = points++; 
        int result2 = ++bonus; 
        int result3 = --lives; 
        int result4 = lives--; 

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    
        int count = 0;
        
        int count1 = count + 4;
        int count2 = count1 * 2; 
        int count3 = count2 - 1;
        

        System.out.println("count = " + count3);
    

        
    }
}
