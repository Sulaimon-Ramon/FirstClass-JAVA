import java.util.Random;

public class Number {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            int number = rand.nextInt(10); 
            System.out.println(number);
        }
    }
}