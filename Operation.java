import java.util.Scanner;

public class Operation {
    public static void main(String[] args){

        double number1;
        double number2;
        double result = 0;
        String operand;


        Scanner operation = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = operation.nextDouble();

        Scanner operation1 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        number2 = operation1.nextDouble();

        Scanner operation2 = new Scanner(System.in);
        System.out.print("Enter the Operand: ");
        operand = operation2.nextLine();

        switch (operand){
            case "+" :
              result =  number1 + number2;
              break;
            case "-" :
                result =  number1 - number2;
                break;
            case "*" :
                result =  number1 * number2;
                break;
            case "/" :
                result =  number1 / number2;
                break;
            case "%":
                result = number1 % number2;
                break;
            default:
                System.out.println("Invalid operand");
        }

        System.out.printf("%.1f\n", number1);
        System.out.printf("%.1f\n", number2);
        System.out.printf("%s\n", operand);
        System.out.println("The result is: " +  result);

    }
}