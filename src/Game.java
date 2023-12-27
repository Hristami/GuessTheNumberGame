import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Guess The number");
            int guessedNumber = sc.nextInt();

            if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
            } else if (guessedNumber < hiddenNumber) {
                System.out.println("More");
            } else {
                System.out.println("You got it right!");
                break;
            }
        }
    }
}
