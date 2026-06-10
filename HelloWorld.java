import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // Variables

        int age = 16;
        char charName = 'R';
        double height = 7.5;
        String name = "Ramon";


        System.out.println(name);
        System.out.println(age);
        System.out.println(charName);
        System.out.println(height);



        // Escape Sequence

        System.out.println("Hello World!\nGood Morning!");
        System.out.println("Hello World!\tGood Morning!");
        System.out.println("\\Hello World!\\Good Morning!");
        System.out.println("\"I am a Liverpool fan\"");
        System.out.println("The First Character of my name is 'R'");
        System.out.println("Sulaimon\rRamon");



        double price = 500;
        String item = "Airpod pro";
        int qty = 3;


        // Format Specifier

        System.out.printf("I am %d%n", age);
        System.out.printf("My name is %s%n", name);
        System.out.printf("%-15s %5d $%, .2f%n", item, qty, price * qty);


        // Operators

        int Num1 = 20;
        int Num2 = 30;
        int firstResult = Num1 + Num2;


        double Num4 = 80.50;
        double Num5 = 50.00;
        double secondResult = Num4 - Num5;


        int Num7 = 100;
        double Num8 = 0.5;
        double thirdResult = Num7 * Num8;


        final double PI = 3.14;
        int Num6 = 10;
        double fourthResult = PI / Num6;

        int Num9 = 100;
        int Num10 = 8;
        int fifthResult = Num9 % Num10;


        System.out.println("The Sum is : " + firstResult);
        System.out.println("The Difference is : " + secondResult);
        System.out.println("The Multiplication is : " + thirdResult);
        System.out.println("The Division is : " + fourthResult);
        System.out.println("The Modulus is : " + fifthResult);


        // Relational Operator 

        int x = 5;
        int y = 05;
        boolean z = x == y;

        System.out.println(z);

        // Increment/Decrement operators

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
    


        // Ternary Operator

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int votersAge = input.nextInt();

        String status = (votersAge >= 18) ? "You can vote" : "You cannot vote";

        System.out.println(status);

        // If/Else Statement

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your Score : ");
        int grade = input.nextInt();

        if(grade <= 35){
            System.out.println("You passed with an F: " + grade + " " + "Fail!");
        }else if(grade <= 40){
            System.out.println("You passed with an E: " + grade + " " + "Pass!");
        }else if(grade <= 55){
            System.out.println("You passed with a D: " + grade + " " + "Average!");
        }else if(grade <= 69){
            System.out.println("You passed with a C: " + grade + " " + "Credit!");
        }else if(grade <= 79){
            System.out.println("You passed with a B: " + grade + " " + "Excellent!");
        }else if(grade <= 100){
            System.out.println("You passed with an A: " + grade + " " + "Distinction!");
        }else{
            System.out.println("Score cannot be less than 0 or greater than 100");
        }


        int personAge;
        String hasID;


        Scanner input2 = new Scanner(System.in);
        System.out.println("How old are you? : ");

        personAge  = input.nextInt();

        if(personAge >= 18) {
            System.out.println("Do You have an ID? (Yes/No) ");
            hasID = input2.nextLine();
            if( hasID.equalsIgnoreCase("Yes")){
              System.out.println("Let's Have Fun!");
            }else{
               System.out.println("Sorry!, There is no way of proving you are 18"); 
            }
        }else{
            System.out.println("Sorry!, Entry is only allowed for people who are 18 and above");
        }


        // Switch Case

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the day to get the food roaster : ");
        String day = input.next();

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Pasta and Meatball!");
                break;
            case "tuesday":
                System.out.println("Jollof-Rice and Turkey!");
                break;
            case "tednesday":
                System.out.println("Pounded Yam and Efo-riro!");
                break;
            case "thursday":
                System.out.println("Yam and Egg sauce!");
                break;  
            case "friday":
                System.out.println("Noodles and Chicken!");
                break;  
            case "saturday":
                System.out.println("Bread and Beans!");
                break;  
            case "sunday":
                System.out.println("Fried-Rice and Chicken!");
                break;          
            default:
                System.out.println("This input is not valid!");
                break;
        }


        // Loops
        
        // for loop
        
        int i = 0;

        for( i = 0; i <= 20; i+=2){
            System.out.println(i);
        }

        for (int f = 1; f <= 20; f++){
           
            if(f % 2 == 0)continue;
            System.out.println(f);
        }


       // while loop
        
        int j = 10;

        while (j >= 0){
            System.out.println(j);
            j--;
        }


           // do-while loop

           Scanner input4 = new Scanner(System.in);

           int choice;
           do{
              System.out.println("1. New Game  2. Settings  3. Exit");
              System.out.print("Enter Choice : ");
              choice = input4.nextInt();

             if(choice == 1){
                 System.out.println("Welcome!, let's play a game");
             }else if(choice == 2){
                 System.out.println("What settings would you like to change?");
             }else if(choice == 3){
                 System.out.println("EXiting Game.....");
                 System.out.println("Goodbye!");
             }else{
                System.out.println("You entered a wrong input");
             }
           } while (choice != 3);


        //Nested loop

        for(int r = 1; r <= 10; r++){
            for(int k = 1; k <= 10; k++){
                System.out.printf("%4d", r * k);
            }
            System.out.println();
        }

        
        // Array
        
        String[] arrCar = {"BMW", "Toyota", "Lamboghini", "Dodge", "Mercedes Benz"};
        
          for(String arr: arrCar){
              System.out.println(arr);
          }

        
    }
}

